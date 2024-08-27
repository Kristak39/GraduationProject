package com.Cristian.GraduationProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int cart_id;

    @Column(nullable = false)
    private int user_id;

    @Column(nullable = false)
    private int product_id;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private int supplier_id;

}
