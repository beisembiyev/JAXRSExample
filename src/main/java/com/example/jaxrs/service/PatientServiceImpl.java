package com.example.jaxrs.service;

import com.example.jaxrs.models.Patient;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PatientServiceImpl implements PatientService{

    @Override
    public List<Patient> getPatients() {
        return Arrays.asList(
            new Patient(1,"asd")
        );
    }
}
