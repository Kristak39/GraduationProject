package com.Cristian.GraduationProject.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Products {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    long product_id;

    @Column(nullable = false)
    String product_name;

    @Column(nullable = false)
    String product_description;

    @Column(nullable = false)
    double productPrice;

    @Column(nullable = false)
    int unitInStock;

    @Column(nullable = false)
    int unitOnOrder;

    @ManyToOne
    Categories category;

    @ManyToOne
    Supplier supplier;

}
