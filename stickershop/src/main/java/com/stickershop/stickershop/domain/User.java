package com.stickershop.stickershop.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(length = 20, nullable = false, unique = true)
    private String id;

    @Column(length = 20, nullable = false)
    private String userName;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(length = 255, nullable = false)
    private String password;

    @Column(length = 20, nullable = false, unique = true)
    private String nickname;

    @ManyToMany
    @JoinTable(name = "user_coupon",
                joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "coupon_id", referencedColumnName = "id"))
    private List<Coupon> couponList;

    /*private Cart cart;
    private Set<Role> roles;
    private List<Order> orderList;
    private String address;
    private String phone;
    private int zipCode;
    private int mileage;
    private Date regDate;
    private Date modDate;*/
}
