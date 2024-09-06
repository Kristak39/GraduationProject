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

    public Products getProductById(long id) {
        return productsRepository.findById(id).get();
    }
    public void addProduct(Products products) {
         productsRepository.save(products);
    }

    public void updateProduct(Products products) {
         productsRepository.save(new Products(products.getProduct_id(),
                 products.getProduct_name(),
                 products.getProduct_description(),
                 products.getProductPrice(),
                 products.getUnitInStock(),
                 products.getUnitOnOrder(),
                 products.getCategory(),
                 products.getSupplier()));
    }

    public void deleteProduct(long id) {
        productsRepository.deleteById(id);
    }

}
