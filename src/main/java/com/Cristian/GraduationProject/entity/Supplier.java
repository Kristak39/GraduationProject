package com.Cristian.GraduationProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int supplierId;

    @Column(nullable = false)
    private String supplierName;

    @Column(nullable = false)
    private String supplierAddress;

    @Column(nullable = false)
    private String supplierPhone;

    @Column(nullable = false)
    private String supplierEmail;

}
