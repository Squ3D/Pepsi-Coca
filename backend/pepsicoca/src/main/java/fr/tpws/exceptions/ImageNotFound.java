package fr.tpws.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ImageNotFound extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ImageNotFound(int id) {
		super(String.format("Aucune image avec l'id : %d a été trouvé.", id));
	}
}
