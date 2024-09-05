package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Products;
import com.Cristian.GraduationProject.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;
import java.util.concurrent.TimeUnit;


@RestController
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @Autowired
    private RedisTemplate <String, String> redisTemplate;

    private static final String STRING_KEY_PREFIX = "redis:com:Cristian:graduation:project:products";

    @GetMapping("/getAllProducts")
    public List getAllProducts(){
        return productsService.getAllProducts();
    }

    @GetMapping("/getProductById/{index}")
    public Products getProductById(@PathVariable long index){
        return productsService.getProductById(index);
    }

    @PutMapping("/updateProduct")
    public void updateProduct(@RequestBody Products products){
        productsService.updateProduct(products);
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
