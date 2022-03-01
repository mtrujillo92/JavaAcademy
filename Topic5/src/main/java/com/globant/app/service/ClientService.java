package com.globant.app.service;

import com.globant.app.entity.Client;
import org.springframework.stereotype.Component;

@Component
public interface ClientService {
    public Client saveClient(Client client);

    public Client findByClientId(int clientId);
}
