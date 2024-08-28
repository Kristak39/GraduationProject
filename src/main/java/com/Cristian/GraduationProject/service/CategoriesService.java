package com.Cristian.GraduationProject.service;

import com.Cristian.GraduationProject.entity.Categories;
import com.Cristian.GraduationProject.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    public Categories getCategoriesById(int id) {
        return categoriesRepository.findById(id).get();
    }
    public Categories addCategories(Categories categories) {
        return categoriesRepository.save(categories);
    }

    public Categories updateCategories(Categories categories) {
        return categoriesRepository.save(categories);
    }

    public void deleteCategories(int id) {
        categoriesRepository.deleteById(id);
    }
}
