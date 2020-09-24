package fr.tpws.payload;

public class UploadImageResponse {
	private String imagePath;
	private String imageDownloadUri;
	private long size;
	public UploadImageResponse(String imagePath, String imageDownloadUri, long size) {
		super();
		this.imagePath = imagePath;
		this.imageDownloadUri = imageDownloadUri;
		this.size = size;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImageDownloadUri() {
		return imageDownloadUri;
	}
	public void setImageDownloadUri(String imageDownloadUri) {
		this.imageDownloadUri = imageDownloadUri;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}

}
