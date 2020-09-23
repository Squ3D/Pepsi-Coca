package cjo;

public enum Categories {
	IDENTIFIANTS(0),
	BANQUE(1),
	CONFIDENTIEL(2),
	UNDEFINED(-1);
	
	private final int idCat;
	
	private Categories(int idCat) {
		this.idCat = idCat;
	}
	
	public int getIdCat() {
		return idCat;
	}
}
