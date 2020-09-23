package fr.tpws.persister;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import cjo.Image;

@Path("/images")
public class ImageRessource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Image getImageJSON(@QueryParam("path") String path, @QueryParam("cat") int cat) {
		return new Image(path, cat);
	}
}
