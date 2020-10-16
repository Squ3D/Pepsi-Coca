package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Image {
	
	private int id;
	private String path;
	String webpath = "http://localhost:8888/projetweb/temp/";
	
	public Image() {
		super();
	}
	
	public Image(int id, String path) {
		this.id = id;
		this.path = webpath+path;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	 public void  getLink() throws IOException {
			List <String> tab = new ArrayList<>();
	      	int i = 0;
	          File f = new File("/Applications/MAMP/htdocs/ProjetWeb/a.txt");

	          BufferedReader b = new BufferedReader(new FileReader(f));

	          String readLine;
	          
	          while ((readLine = b.readLine()) != null) {
	        	  String link = readLine;
	              System.out.println(link);
	              tab.add(link);
	              i++;
	              System.out.println(readLine);
	              
	          }      
	          
		}
	    
	
	

}
