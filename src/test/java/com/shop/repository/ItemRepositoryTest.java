package com.shop.repository;

import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
// 통합 테스트를 위한 Spring Boot에서 제공하는 어플리케이션(모든 Bean을 IoC 컨테이너에 등록)
@TestPropertySource(locations="classpath:application-test.properties")
// 기본 설정 application.properties파일 보다 높은 우선순위 파일을 설정
class ItemRepositoryTest {

    @Autowired
            // IoC컨테이너에 등록할 Bean 주입
    ItemRepository itemRepository;

    @Test
    // 테스트할 메소드를 지정
    @DisplayName("상품 저장 테스트")
    // 테스트 코드 실행시 노출될 테스트명 지정
    public void createItemTest(){
        Item item = new Item();
        item.setItemNm("테스트상품");
        item.setPrice(10000);
        item.setItemDetail("테스트 상품 상세 설명");
        item.setItemSellStatus(ItemSellStatus.SELL);
        item.setStockNumber(100);
        item.setRegTime(LocalDateTime.now());
        item.setUpdateTime(LocalDateTime.now());
        Item savedItem = itemRepository.save(item);
        System.out.println(savedItem.toString());
    }

    public void createItemList(){
        for(int i=1;i<=10;i++){
            Item item = new Item();
            item.setItemNm("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setItemSellStatus(ItemSellStatus.SELL);
            item.setStockNumber(100);
            item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            Item savedItem = itemRepository.save(item);
            System.out.println(savedItem.toString());
        }
    }

    @Test
    // 테스트할 메소드를 지정
    @DisplayName("상품명 조회 테스트")
    // 테스트 코드 실행시 노출될 테스트명 지정
    public void findByItemNmTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemNm("테스트 상품1");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }

    @Test
    // 테스트할 메소드를 지정
    @DisplayName("상품명, 상품 상세설명 or 테스트")
    // 테스트 코드 실행시 노출될 테스트명 지정
    public void findByItemNmOrItemDetailTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemNmOrItemDetail("테스트 상품1","테스트상품상세 설명5");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }

    @Test
    // 테스트할 메소드를 지정
    @DisplayName("가격 LessThan 테스트")
    // 테스트 코드 실행시 노출될 테스트명 지정
    public void findByPriceLessThanTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByPriceLessThan(10005);
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }
    @Test
    // 테스트할 메소드를 지정
    @DisplayName("가격 내림차순 조회 테스트")
    // 테스트 코드 실행시 노출될 테스트명 지정
    public void findByPriceLessThanOrderByPriceDescTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByPriceLessThanOrderByPriceDesc(10005);
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }
    @Test
    // 테스트할 메소드를 지정
    @DisplayName("@Query를 이용한 상품 조회 테스트")
    // 테스트 코드 실행시 노출될 테스트명 지정
    public void findByItemDetailTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemDetail("테스트 상품 상세 설명");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }

    @Test
    // 테스트할 메소드를 지정
    @DisplayName("nativeQuery 속성을 이용한 상품 조회 테스트")
    // 테스트 코드 실행시 노출될 테스트명 지정
    public void findByItemDetailByNativeTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemDetailByNative("테스트 상품 상세 설명");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }
}