package fr.tpws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import fr.tpws.model.Image;
import fr.tpws.payload.UploadImageResponse;
import fr.tpws.services.ImageStorageService;

@RestController
public class ImageController {
	private static final Logger logger = LoggerFactory.getLogger(ImageController.class);

	@Autowired
	private ImageStorageService imageStorageService;
	
	
	@PostMapping("/uploadImage")
	public UploadImageResponse uploadImage(@RequestParam("imagePath") String imagePath, @RequestParam("cat") int cat) {
		// Ouvrir image depuis path en local puis persist
//		Image dbImage = imageStorageService.storeImage(image, cat);
//
//        String imageDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
//                .path("/downloadImage/"+dbImage.getId())
//                .toUriString();
//
//        return new UploadImageResponse(dbImage.getPath(), imageDownloadUri,
//                image.getSize());
		return null;
	}
}
