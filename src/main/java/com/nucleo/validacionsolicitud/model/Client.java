package com.nucleo.validacionsolicitud.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String typeDocument;
    private int document;
    private String name;
    private String phone;
    private String homePhone;
    private boolean existPatria;
    private boolean existExchange;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeDocument() {
        return this.typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public int getDocument() {
        return this.document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomePhone() {
        return this.homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public boolean isExistPatria() {
        return this.existPatria;
    }

    public boolean getExistPatria() {
        return this.existPatria;
    }

    public void setExistPatria(boolean existPatria) {
        this.existPatria = existPatria;
    }

    public boolean isExistExchange() {
        return this.existExchange;
    }

    public boolean getExistExchange() {
        return this.existExchange;
    }

    public void setExistExchange(boolean existExchange) {
        this.existExchange = existExchange;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(typeDocument, client.typeDocument) && document == client.document && Objects.equals(name, client.name) && Objects.equals(phone, client.phone) && Objects.equals(homePhone, client.homePhone) && existPatria == client.existPatria && existExchange == client.existExchange;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeDocument, document, name, phone, homePhone, existPatria, existExchange);
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", typeDocument='" + getTypeDocument() + "'" +
            ", document='" + getDocument() + "'" +
            ", name='" + getName() + "'" +
            ", phone='" + getPhone() + "'" +
            ", homePhone='" + getHomePhone() + "'" +
            ", existPatria='" + isExistPatria() + "'" +
            ", existExchange='" + isExistExchange() + "'" +
            "}";
    }



}
