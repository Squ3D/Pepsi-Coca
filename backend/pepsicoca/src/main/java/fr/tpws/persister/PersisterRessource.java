package fr.tpws.persister;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cjo.Categories;
import cjo.Image;

@Path("/persist")
public class PersisterRessource {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response persistImageDataBase(Image image) {
		String result;
		if(image.getCategorie() == Categories.BANQUE.getIdCat() ||
				image.getCategorie() == Categories.IDENTIFIANTS.getIdCat() ||
				image.getCategorie() == Categories.CONFIDENTIEL.getIdCat()) {
			
			// Ne fais rien car image est déjà en base de donnée
			result = "Image sauvegardée : " + image;
		} else {
			// JPA Delete BDD
			result = "Image supprimée : " + image;
		}
		
		return Response.status(201).entity(result).build();
	}
}

