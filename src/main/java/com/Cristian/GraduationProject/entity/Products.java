package com.Cristian.GraduationProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int productId;

    @Column(nullable = false)
    private int productCategoryId;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private String productDescription;

    @Column(nullable = false)
    private double productPrice;

    @Column(nullable = false)
    private int unitInStock;

    @Column(nullable = false)
    private int unitOnOrder;

}
