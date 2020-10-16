package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("pepsi")
@Configuration
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
    	register(ImageRessource.class);
        register(RicoRessource.class);
    }
}
