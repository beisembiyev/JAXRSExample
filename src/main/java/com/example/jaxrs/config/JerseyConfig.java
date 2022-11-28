package com.example.jaxrs.config;

import com.example.jaxrs.controller.PatientController;
import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    @PostConstruct
    public void init(){

        register(PatientController.class);
    }
}
