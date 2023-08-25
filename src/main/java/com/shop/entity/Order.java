package com.shop.entity;

import com.shop.constant.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id") // Member 엔티티와 연결
    private Member member;

    private LocalDateTime orderDate; //주문일

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus; //주문상태

    @OneToMany(mappedBy = "order") // 주인이 아닌 쪽은 연관 관계 메핑 시 mappedBy 속성의 값으로 연관 관계의 주인을 설정(주인이 아닌 쪽은 읽기만 가능)
    private List<OrderItem> orderItems = new ArrayList<>();

    private LocalDateTime regTime;

   private LocalDateTime updateTime;

}