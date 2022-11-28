package com.example.jaxrs.models;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "patient")
public class Patient {

    private long id;
    private String name;

    public Patient(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Patient() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
