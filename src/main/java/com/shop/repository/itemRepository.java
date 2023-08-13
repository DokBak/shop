package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface itemRepository extends JpaRepository<Item, Long> {
// Item클래스의 기본키 타입이 Long이므로 Long으로 설정

}
