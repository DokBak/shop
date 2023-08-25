package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id") // Item 엔티티와 연결
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id") // Order 엔티티와 연결
    private Order order;

    private int orderPrice; //주문가격

    private int count; //수량

    private LocalDateTime regTime;

    private LocalDateTime updateTime;
}