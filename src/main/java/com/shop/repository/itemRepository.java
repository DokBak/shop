package com.shop.repository;

import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>, QuerydslPredicateExecutor<Item> {
// Item클래스의 기본키 타입이 Long이므로 Long으로 설정
    List<Item> findByItemNm(String itemNm);
    //Select문 검색 : select * from ItemTable where ItemTable.itemNm=?
    List<Item> findByItemNmOrItemDetail(String itemNm,String itemDetail);
    //Select문 검색 : select * from ItemTable where ItemTable.itemNm=? or ItemTable.itemDetail=?
    List<Item> findByPriceLessThan(Integer price);
    //Select문 검색 : select * from ItemTable where ItemTable.price < ?
    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);
    //Select문 검색 : select * from ItemTable where ItemTable.price < ? order by price desc
    @Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);
    //Select문 검색 : select * from ItemTable where ItemTable.item_detail like %itemDetail% order by ItemTable.price desc
    @Query(value="select * from item i where i.item_Detail like %:itemDetail% order by i.price desc", nativeQuery = true)
    List<Item> findByItemDetailByNative(@Param("itemDetail") String itemDetail);
    //Select문 검색 : select * from Item where ItemTable.item_detail like %itemDetail% order by ItemTable.price desc
    //nativeQuery속성 : 기존 쿼리를 그대로 활용 가능 (nativeQuery속성 사용시 데이터베이스에 대해 독립적이라는 장점이 사라짐)


}
