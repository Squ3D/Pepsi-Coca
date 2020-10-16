package com.example.demo;

public class Image {
	
	private int id;
	private String path;
	private static String webpath = "http://localhost:8888/projetweb/temp/";
	
	public Image() {
		super();
	}
	
	public Image(int id, String path) {
		this.id = id;
		this.path = webpath + path;
		
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
}
