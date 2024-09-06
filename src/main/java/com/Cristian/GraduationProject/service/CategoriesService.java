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

    public Categories getCategoriesById(long id) {
        return categoriesRepository.findById(id).get();
    }
    public Categories addCategories(Categories categories) {
        return categoriesRepository.save(new Categories(categories.getCategory_id(),
                categories.getCategoryName()));
    }

    public Categories updateCategories(Categories categories) {
        return categoriesRepository.save(categories);
    }

    public void deleteCategories(long id) {
        categoriesRepository.deleteById(id);
    }
}
