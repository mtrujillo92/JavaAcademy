package com.globant.app.repository;

import com.globant.app.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
    public Client findByClientId(int id);
}
