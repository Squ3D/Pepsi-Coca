package fr.tpws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "images")
public class Image {
	@Id
	@GeneratedValue
	private int id;
	
	private String path;
	
	private int categorie;
	
	@Lob
	private byte[] data;
	
	/**
	 * Constructeurs
	 */
	public Image() {}
	public Image(String path, int categorie, byte[] data) {
		this.path = path;
		this.categorie = categorie;
		this.data = data;
	}
	
	/**
	 * Getteurs / Setters
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getCategorie() {
		return categorie;
	}
	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}
	
	@Override
	public String toString() {
		return "Image : " + this.getPath() + " | Cat : " + this.getCategorie();
	}
}
