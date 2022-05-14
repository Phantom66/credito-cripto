package com.nucleo.validacionsolicitud.service;

import java.util.List;
import com.nucleo.validacionsolicitud.model.Client;
import com.nucleo.validacionsolicitud.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

}
