package com.Cristian.GraduationProject.controler;

import com.Cristian.GraduationProject.entity.Categories;
import com.Cristian.GraduationProject.service.CategoriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriesController {


    private CategoriesService categoriesService;

    @GetMapping("/allCategories")
    public List<Categories> getAllCategories(){
        return categoriesService.getAllCategories();
    }

    @GetMapping("/findCategory/{index}")
    public Categories findCategory(@PathVariable long index){
        return categoriesService.getCategoriesById(index);
    }

    @PostMapping("/addCategory")
    public Categories addCategory(@RequestBody Categories categories){
        return categoriesService.addCategories(categories);
    }

//    @PutMapping("/updateCategory/{index}")
//    public Categories updateCategory(@PathVariable int index,@RequestBody Categories categories){
//        return categoriesService.updateCategories(index,categories);
//    }

    @DeleteMapping("deleteCategory/{index}")
    public void deleteCategory(@PathVariable long index){
        categoriesService.deleteCategories(index);
    }
}
