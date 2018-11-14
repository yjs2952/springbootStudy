package com.stickershop.stickershop.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orderinfo")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "shipping_id")
    private Shipping shipping;

    @OneToOne
    @JoinColumn(name = "oder_status_id")
    private OrderStatus orderStatus;

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "user_coupon_id")
    private List<UserCoupon> userCouponList;
}
