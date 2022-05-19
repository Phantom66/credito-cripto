package com.nucleo.validacionsolicitud.model;


import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;



@Data
@Entity
public class StatusCredit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Credit credit;
    @OneToOne(cascade = CascadeType.ALL)
    private TypeStatusCredit typeStatusCredit;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    
}
