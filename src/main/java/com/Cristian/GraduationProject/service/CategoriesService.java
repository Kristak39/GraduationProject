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
        return categoriesRepository.findById(id).isPresent()
                ?categoriesRepository.findById(id).get() : null;
    }
    public void addCategories(Categories categories) {
         categoriesRepository.save(new Categories(categories.getCategory_id(),
                categories.getCategoryName()));
    }

    public void updateCategories(long index, Categories categories) {
        if (categoriesRepository.findById(index).isPresent()) {
            categoriesRepository.save(new Categories(index, categories.getCategoryName()));
        }else categoriesRepository.save(categories);
    }

    public void deleteCategories(long id) {
        categoriesRepository.deleteById(id);
    }
}
