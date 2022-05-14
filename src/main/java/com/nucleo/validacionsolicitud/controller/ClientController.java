package com.nucleo.validacionsolicitud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import com.nucleo.validacionsolicitud.model.Client;
import com.nucleo.validacionsolicitud.service.ClientServiceImpl;



@Slf4j
@RequestMapping("/")
@RestController
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping(value = "obtener-clientes")
    public List<Client> findAll(){
        log.info("Obteniendo clientes");
        return clientService.findAll();
    }

    @PostMapping(value = "guadar-cliente")
    public Client save(@RequestBody Client client){
        log.info("Guardando cliente {}", client);
        return clientService.save(client);
    }
    
}
