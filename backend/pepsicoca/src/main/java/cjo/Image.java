package cjo;

public class Image {
	private String path;
	private int categorie;
	
	/**
	 * Constructeurs
	 */
	public Image() {}
	public Image(String path, int categorie) {
		this.path = path;
		this.categorie = categorie;
	}
	
	/**
	 * Getteurs / Setters
	 */
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
