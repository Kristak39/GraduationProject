package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Products;
import com.Cristian.GraduationProject.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping("/get_all_products")
    public List getAllProducts(){
        return productsService.getAllProducts();
    }

    @GetMapping("/get_product_by_index/{index}")
    public Products getProductById(@PathVariable long index){
        return productsService.getProductById(index);
    }

    @PutMapping("/update_product_by_index/{index}")
    public void updateProduct(@PathVariable long index,@RequestBody Products products){
        productsService.updateProduct(index, products);
    }

    @PostMapping("/add_product")
    public void addProduct(@RequestBody Products products){
        productsService.addProduct(products);
    }

    @DeleteMapping("/delete_product_by_index/{index}")
    public void deleteProduct(@PathVariable long index){
        productsService.deleteProduct(index);
    }


}
