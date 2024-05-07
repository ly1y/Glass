package com.bespalaya.glass.web.controllers;

import com.bespalaya.glass.data.entities.ProductEntity;
import com.bespalaya.glass.data.repositories.ProductRepository;
import com.bespalaya.glass.web.contracts.ApiRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ApiRouter.ProductRouter.BASE_URL)
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }
}
