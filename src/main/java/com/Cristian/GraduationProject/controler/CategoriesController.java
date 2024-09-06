package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Categories;
import com.Cristian.GraduationProject.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("/all_categories")
    public List<Categories> getAllCategories(){
        return categoriesService.getAllCategories();
    }

    @GetMapping("/find_category_by_index/{index}")
    public Categories findCategory(@PathVariable long index){
        return categoriesService.getCategoriesById(index);
    }

    @PostMapping("/add_category")
    public void addCategory(@RequestBody Categories categories){
        categoriesService.addCategories(categories);
    }

    @PutMapping("/update_category_by_index/{index}")
    public void updateCategory(@PathVariable long index, @RequestBody Categories categories){
        categoriesService.updateCategories(index,categories);
    }

    @DeleteMapping("delete_category_by_index/{index}")
    public void deleteCategory(@PathVariable long index){
        categoriesService.deleteCategories(index);
    }
}
