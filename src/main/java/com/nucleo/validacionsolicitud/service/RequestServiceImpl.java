package com.nucleo.validacionsolicitud.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import com.nucleo.validacionsolicitud.model.Request;
import com.nucleo.validacionsolicitud.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;


@Slf4j
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
        log.info("Tiene solicitud {}", requestRepository.findRequest(Integer.parseInt(document)).isPresent());
        return requestRepository.findRequest(Integer.parseInt(document)).orElse(new Request());
    }

    
    public Optional<String> isCredit(String document) {
        // final boolean f = requestRepository.findRequest(Integer.parseInt(document)).isPresent();
        log.info("Evaluando si tiene solicitud {} ", document);
        return requestRepository.isCredit(17639604);
    }

}
