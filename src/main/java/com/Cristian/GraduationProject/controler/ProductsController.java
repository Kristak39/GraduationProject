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

    @GetMapping("/getAllProducts")
    public List getAllProducts(){
        return productsService.getAllProducts();
    }

    @GetMapping("/getProductById/{index}")
    public Products getProductById(@PathVariable long index){
        return productsService.getProductById(index);
    }

    @PutMapping("/updateProduct/{index}")
    public void updateProduct(@PathVariable long index,@RequestBody Products products){
        productsService.updateProduct(index, products);
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Products products){
        productsService.addProduct(products);
    }

    @DeleteMapping("/deleteProduct/{index}")
    public void deleteProduct(@PathVariable long index){
        productsService.deleteProduct(index);
    }


}
