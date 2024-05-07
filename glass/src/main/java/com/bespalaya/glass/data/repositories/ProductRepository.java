package com.bespalaya.glass.data.repositories;

import com.bespalaya.glass.data.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
