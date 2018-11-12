package com.stickershop.stickershop.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int totalQty;

    @Column
    private int curQty;

    @Column
    private int saleMoney;

    @Column
    private double saleRatio;

    @Temporal(TemporalType.TIMESTAMP)
    private Date expireDate;

    @Lob
    private String description;
}
