package com.Cristian.GraduationProject.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Supplier {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    long supplier_id;

    @Column(nullable = false)
    String supplierName;

    @Column(nullable = false)
    String supplierPhone;

    @Column(nullable = false)
    String supplierEmail;

    @ManyToMany
    Set<Address> addresses;
}
