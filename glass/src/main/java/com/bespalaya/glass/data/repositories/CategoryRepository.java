package com.bespalaya.glass.data.repositories;

import com.bespalaya.glass.data.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
