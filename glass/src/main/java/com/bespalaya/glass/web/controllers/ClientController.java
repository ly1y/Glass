package com.bespalaya.glass.web.controllers;

import com.bespalaya.glass.data.entities.ClientEntity;
import com.bespalaya.glass.services.ClientService;
import com.bespalaya.glass.web.contracts.ApiRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ApiRouter.ClientRouter.BASE_URL)
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<ClientEntity> getAll() {
        return clientService.findAll();
    }
}
