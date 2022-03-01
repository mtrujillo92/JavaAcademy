package com.globant.app.controller;

import com.globant.app.entity.Client;
import com.globant.app.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client saveClient(@RequestBody Client client){
        Client clientResponse = clientService.saveClient(client);
        return clientResponse;
    }

    @GetMapping("/{id}")
    public Client getClientDetails(@PathVariable int id){
        Client clientResponse = clientService.findByClientId(id);
        return clientResponse;
    }

}
