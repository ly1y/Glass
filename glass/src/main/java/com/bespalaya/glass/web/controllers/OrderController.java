package com.bespalaya.glass.web.controllers;

import com.bespalaya.glass.data.entities.OrderEntity;
import com.bespalaya.glass.services.OrderService;
import com.bespalaya.glass.web.contracts.ApiRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ApiRouter.OrderRouter.BASE_URL)
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<OrderEntity> getAll() {
        return orderService.findAll();
    }
}
