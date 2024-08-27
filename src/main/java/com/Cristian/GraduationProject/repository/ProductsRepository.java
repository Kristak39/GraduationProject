package com.Cristian.GraduationProject.repository;

import com.Cristian.GraduationProject.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Integer> {
}
