package com.kaiquesilva.appfinancial.domain.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_expenses")
public class expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Double price;

    private Double amount_paid;

}
