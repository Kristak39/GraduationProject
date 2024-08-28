package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Categories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriesController {

    CategoriesController categoriesController;

    @GetMapping("/allCategories")
    public List<Categories> getAllCategories(){
        return categoriesController.getAllCategories();
    }

    @PostMapping("/findCategory/{index}")
    public Categories findCategory(@PathVariable int index){
        return categoriesController.findCategory(index);
    }

    @PostMapping("/addCategory")
    public Categories addCategory(@RequestBody Categories categories){
        return categoriesController.addCategory(categories);
    }

    @PutMapping("/updateCategory/{index}")
    public Categories updateCategory(@PathVariable int index,@RequestBody Categories categories){
        return categoriesController.updateCategory(index,categories);
    }

    @DeleteMapping("deleteCategory/{index}")
    public void deleteCategory(@PathVariable int index){
        categoriesController.deleteCategory(index);
    }
}
