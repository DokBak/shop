package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name="cart_item")
public class CartItem {

    @Id
    @GeneratedValue
    @Column(name = "cart_item_id")
    private Long id;

    @ManyToOne // N:1 관계 설정
    @JoinColumn(name="cart_id") // Cart 엔티티와 연결
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "item_id") // Item 엔티티와 연결
    private Item item;

    private int count;

}