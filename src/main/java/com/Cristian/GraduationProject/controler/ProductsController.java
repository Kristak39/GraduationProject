package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Products;
import com.Cristian.GraduationProject.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping("/getAllProducts")
    public List getAllProducts(){
        return productsService.getAllProducts();
    }

    @PostMapping("/getProductById/{index}")
    public Products getProductById(@PathVariable Integer index){
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
    public void deleteProduct(@PathVariable int index){
        productsService.deleteProduct(index);
    }





}
