package fr.tpws.persister;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("pepsicoca")
@Configuration
public class JerseyConfiguration extends ResourceConfig{
	public JerseyConfiguration() {
		register(PersisterRessource.class);
		register(ImageRessource.class);
	}
}
