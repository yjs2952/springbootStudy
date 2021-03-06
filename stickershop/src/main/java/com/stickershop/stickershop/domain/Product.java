package com.stickershop.stickershop.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "product_category", joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    List<Category> categoryList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", nullable = false)
    private List<Image> imageList;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int totalQty;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int curQty;
    //List<Image>
}
