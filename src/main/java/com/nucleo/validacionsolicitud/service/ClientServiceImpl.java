package com.nucleo.validacionsolicitud.service;

import java.util.List;
import java.util.stream.Stream;
import com.nucleo.validacionsolicitud.model.Client;
import com.nucleo.validacionsolicitud.model.Request;
import com.nucleo.validacionsolicitud.repository.ClientRepository;
import com.nucleo.validacionsolicitud.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ClientServiceImpl implements ClientService, ResquestService {

    @Autowired 
    private ClientRepository clientRepository;
    @Autowired 
    private RequestRepository requestRepository;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Stream<Request> find() {
        return requestRepository.findAll().stream();
    }

    @Override
    public Request findRequest(String document) {
        return requestRepository.findRequest(Integer.parseInt(document)).orElse(new Request());
    }



}
