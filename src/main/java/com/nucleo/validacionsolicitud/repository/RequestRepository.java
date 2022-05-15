package com.nucleo.validacionsolicitud.repository;



import java.util.Optional;

import com.nucleo.validacionsolicitud.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface RequestRepository extends JpaRepository<Request, Long>{

    /**
     * Consulta si el cliente tiene una solicitud
     * @param document
     * @return
     */
    @Query("SELECT r FROM Request r join r.client cl WHERE cl.document = ?1")
    public Optional<Request> findRequest(int document);
    
}
