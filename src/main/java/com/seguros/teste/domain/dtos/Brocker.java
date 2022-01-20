package com.seguros.teste.domain.dtos;

import java.io.Serializable;

public class Brocker implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String name;
    private String document;
    private String code;
    private String createDate;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return this.document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

}