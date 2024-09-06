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
        return productsRepository.findById(id).isPresent()
                ? productsRepository.findById(id).get() : null;
    }
    public void addProduct(Products products) {
         productsRepository.save(products);
    }

    public void updateProduct(long index, Products products) {
        if (productsRepository.findById(index).isPresent()) {
         productsRepository.save(new Products(index,
                 products.getProduct_name(),
                 products.getProduct_description(),
                 products.getProductPrice(),
                 products.getUnitInStock(),
                 products.getUnitOnOrder(),
                 products.getCategory(),
                 products.getSupplier()));
        }else productsRepository.save(products);
    }

    public void deleteProduct(long id) {
        productsRepository.deleteById(id);
    }

}
