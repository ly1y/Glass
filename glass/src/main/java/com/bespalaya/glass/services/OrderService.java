package com.bespalaya.glass.services;

import com.bespalaya.glass.data.entities.OrderEntity;
import com.bespalaya.glass.data.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> findAll() {
        return orderRepository.findAll();
    }
}
