package com.example.jaxrs.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import com.example.jaxrs.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.jaxrs.service.PatientService;

import java.util.ArrayList;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;


    @GET
    @Produces(APPLICATION_JSON)
    public ArrayList<Patient> getPatients() {
        return new ArrayList<Patient>(patientService.getPatients());
    }
}
