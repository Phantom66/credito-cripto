package com.nucleo.validacionsolicitud.repository;


import com.nucleo.validacionsolicitud.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
