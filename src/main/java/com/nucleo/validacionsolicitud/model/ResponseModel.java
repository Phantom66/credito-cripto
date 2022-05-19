package com.nucleo.validacionsolicitud.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ResponseModel<T> {

    private String code;
    private String description;
    private T data;
    
}
