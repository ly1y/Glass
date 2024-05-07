package com.bespalaya.glass.data.repositories;

import com.bespalaya.glass.data.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
