package com.example.bootboard.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sunny_board")
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

}
