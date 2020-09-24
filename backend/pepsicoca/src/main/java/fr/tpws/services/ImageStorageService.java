package fr.tpws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import fr.tpws.exceptions.ImageNotFound;
import fr.tpws.model.Image;
import fr.tpws.repository.ImageRepository;

@Service
public class ImageStorageService {

    @Autowired
    private ImageRepository imageRepository;

    public Image storeImage(MultipartFile image, int cat) {
        // Normalize file name
        String imageName = StringUtils.cleanPath(image.getOriginalFilename());
        Image myImage = null;
        try {
            // Verifie le chemin d'accès
            if(imageName.contains("..")) {
                throw new Exception("Désolé! Le chemin d'acces à l'image est incorrect : " + imageName);
            }

            Image imageFile = new Image(imageName, cat, image.getBytes());

            myImage = imageRepository.save(imageFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
		return myImage;
    }

    public Image getImage(int imageId) {
        return imageRepository.findById(imageId)
                .orElseThrow(() -> new ImageNotFound(imageId));
    }
}
