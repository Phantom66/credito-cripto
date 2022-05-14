package com.nucleo.validacionsolicitud.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nucleo.validacionsolicitud.model.Client;
import com.nucleo.validacionsolicitud.service.ClientServiceImpl;



@RequestMapping("/")
@RestController
public class ClientController {


    private final static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);
    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping(value = "obtener-clientes")
    public List<Client> findAll(){
        LOGGER.info("Obteniendo clientes");
        return clientService.findAll();
    }

    @PostMapping(value = "guadar-cliente")
    public Client save(@RequestBody Client client){
        LOGGER.info("Guardando cliente {}", client);
        return clientService.save(client);
    }
    
}
