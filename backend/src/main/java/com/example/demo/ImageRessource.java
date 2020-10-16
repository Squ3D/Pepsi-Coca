package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("images")
public class ImageRessource {
	
	private final String localDir = "http://localhost:8888/projetweb/";
	private final String localListImg = "C:\\Users\\Unamed\\Documents\\GitHub\\Pepsi-Coca\\web\\a.txt";

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getListImages() throws IOException {

		List <String> tab = new ArrayList<>();
		File f = new File(localListImg);

		BufferedReader b = new BufferedReader(new FileReader(f));

		String readLine;
		while ((readLine = b.readLine()) != null) {
			tab.add(localDir + readLine);

		}
		b.close();
		return tab;
	}             
}