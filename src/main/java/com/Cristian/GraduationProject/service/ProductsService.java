package com.Cristian.GraduationProject.service;

import com.Cristian.GraduationProject.entity.Products;
import com.Cristian.GraduationProject.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<Products> getAllProducts() {
      return productsRepository.findAll();
    }

    public Products getProductById(int id) {
        return productsRepository.findById(id).get();
    }
    public void addProduct(Products products) {
         productsRepository.save(products);
    }
    public void updateProduct(Products products) {
         productsRepository.save(products);
    }
    public void deleteProduct(int id) {
        productsRepository.deleteById(id);
    }
}
