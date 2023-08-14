package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
// Item클래스의 기본키 타입이 Long이므로 Long으로 설정
    List<Item> findByItemNm(String itemNm);
    //Select문 검색 : select * from ItemTable where ItemTable.itemNm=?
    List<Item> findByItemNmOrItemDetail(String itemNm,String itemDetail);
    //Select문 검색 : select * from ItemTable where ItemTable.itemNm=? or ItemTable.itemDetail=?
    List<Item> findByPriceLessThan(Integer price);
    //Select문 검색 : select * from ItemTable where ItemTable.price < ?
    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);
    //Select문 검색 : select * from ItemTable where ItemTable.price < ? order by price desc
}
