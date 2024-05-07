package com.bespalaya.glass.services;

import com.bespalaya.glass.data.entities.CategoryEntity;
import com.bespalaya.glass.data.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryEntity> findAll() {
        return categoryRepository.findAll();
    }
}
