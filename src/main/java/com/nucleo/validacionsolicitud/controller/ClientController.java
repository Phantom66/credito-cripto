package com.nucleo.validacionsolicitud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nucleo.validacionsolicitud.model.Client;
import com.nucleo.validacionsolicitud.service.ClientServiceImpl;



@RequestMapping("/")
@RestController
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping(value = "obtener-clientes")
    public List<Client> findAll(){
        return clientService.findAll();
    }
    
}
