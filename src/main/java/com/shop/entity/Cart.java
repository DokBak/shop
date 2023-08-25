package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "cart")
@Getter @Setter
@ToString
public class Cart {

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne // 회원(member) 엔티티와 일대일로 매핑
    //(fetch = FetchType.EAGER) : 매핑할 경우 즉시 로딩을 기본 Fetch전략으로 설정
    @JoinColumn(name="member_id") // 회원(member) 엔티티에서 매핑할 외래키를 지정, 미설정시 JPA가 알아서 ID를 찾지만 컬럼명이 원하는 대로 생성되지 않을수 있다.
    private Member member;

}