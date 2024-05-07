package com.bespalaya.glass.web.controllers;

import com.bespalaya.glass.data.entities.CategoryEntity;
import com.bespalaya.glass.services.CategoryService;
import com.bespalaya.glass.web.contracts.ApiRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ApiRouter.CategoryRouter.BASE_URL)
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryEntity> getAll() {
        return categoryService.findAll();
    }
}
