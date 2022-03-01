package com.globant.app.service;

import com.globant.app.entity.Client;
import com.globant.app.entity.ClientDetails;
import com.globant.app.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client) {
        ClientDetails clientDetails = client.getClientDetails();
        clientDetails.setClient(client);
        client = clientRepository.save(client);
        return client;
    }

    @Override
    public Client findByClientId(int clientId) {
        Client client = clientRepository.findByClientId(clientId);
        return client;
    }
}
