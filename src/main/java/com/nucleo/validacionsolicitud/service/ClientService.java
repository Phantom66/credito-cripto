package com.nucleo.validacionsolicitud.service;

import java.util.List;
import com.nucleo.validacionsolicitud.model.Client;


public interface ClientService {

    public List<Client> findAll();
    public Client save(Client client);

}
