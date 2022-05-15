package com.nucleo.validacionsolicitud.service;

import java.util.stream.Stream;

import com.nucleo.validacionsolicitud.model.Request;
import com.nucleo.validacionsolicitud.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements ResquestService {

    @Autowired
    private RequestRepository requestRepository;

    @Override
    public Stream<Request> find() {
        return requestRepository.findAll().stream();
    }

    @Override
    public Request findRequest(String document) {
        return requestRepository.findRequest(Integer.parseInt(document)).orElse(new Request());
    }

}
