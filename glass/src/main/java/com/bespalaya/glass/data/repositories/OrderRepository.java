package com.bespalaya.glass.data.repositories;

import com.bespalaya.glass.data.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
