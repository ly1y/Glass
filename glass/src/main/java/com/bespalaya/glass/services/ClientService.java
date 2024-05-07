package com.bespalaya.glass.services;

import com.bespalaya.glass.data.entities.ClientEntity;
import com.bespalaya.glass.data.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientEntity> findAll() {
        return clientRepository.findAll();
    }
}
