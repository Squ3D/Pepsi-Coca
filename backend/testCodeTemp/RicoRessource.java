package com.example.demo;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Path("Rico")
	public class RicoRessource {
	
	//WebServices pour générer dans le post là liste de chemin d'accées. 

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<String> Rico() throws IOException {
			List <String> tab = new ArrayList<>();
	      	int i = 0;
	          File f = new File("/Applications/MAMP/htdocs/ProjetWeb/a.txt");

	          BufferedReader b = new BufferedReader(new FileReader(f));

	          String readLine;
	          
	          while ((readLine = b.readLine()) != null) {
	              System.out.println(readLine);
	              tab.add(readLine);
	              i++;
	              
	          }
	          
	          return tab;
	          
		}
	    
	                        
	}



