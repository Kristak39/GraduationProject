package com.Cristian.GraduationProject.repository;

import com.Cristian.GraduationProject.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
