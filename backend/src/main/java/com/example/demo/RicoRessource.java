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

@Path("Rico")
	public class RicoRessource {
	
	String ak = "http://localhost:8888/projetweb/";
	

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    //System.out.println("TEST");
	    
	    public int Rico() throws IOException {
			
	    	List <String> tab = new ArrayList<>();
	      	int i = 0;
	          File f = new File("/Applications/MAMP/htdocs/ProjetWeb/a.txt");

	          BufferedReader b = new BufferedReader(new FileReader(f));

	          String readLine;
	          
	          while ((readLine = b.readLine()) != null) {
	        	  String link = ak+readLine;
	              //System.out.println(link);
	              tab.add(link);
	              //System.out.println(tab.size());
	              //System.out.println(ak);
	              
	          }
	          
	          return tab.size();
	          
		}
	    
	                        
	}



