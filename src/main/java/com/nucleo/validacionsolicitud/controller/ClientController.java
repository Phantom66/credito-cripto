package com.nucleo.validacionsolicitud.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.nucleo.validacionsolicitud.model.Client;
import com.nucleo.validacionsolicitud.model.Request;
import com.nucleo.validacionsolicitud.model.RequestModel;
import com.nucleo.validacionsolicitud.model.StatusCredit;
import com.nucleo.validacionsolicitud.model.TypeStatusCredit;
import com.nucleo.validacionsolicitud.service.ClientServiceImpl;
import com.nucleo.validacionsolicitud.service.RequestServiceImpl;



@Slf4j
@RequestMapping("/")
@RestController
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @Autowired
    private RequestServiceImpl requestServiceImpl;

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

    @GetMapping(value = "obtener-solicitud")
    public Optional<String> findAllRequest(){
        log.info("Obtener solicitud");
        return requestServiceImpl.isCredit("document");
        // return requestServiceImpl.find();
    }

    @PostMapping(value = "obtener-solicitud-cliente")
    public Request findRequestByClient(@RequestBody RequestModel requestModel) throws JsonProcessingException{
        log.info("Obtener solicitud cliente {} ", requestModel.getDocument());
        return requestServiceImpl.findRequest(requestModel.getDocument());
    }
    
}
