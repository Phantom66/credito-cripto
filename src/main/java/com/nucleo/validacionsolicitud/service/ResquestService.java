package com.nucleo.validacionsolicitud.service;


import java.util.stream.Stream;
import com.nucleo.validacionsolicitud.model.Request;





public interface ResquestService {
    
    public Stream<Request>find();
    public Request findRequest(String document);


}
