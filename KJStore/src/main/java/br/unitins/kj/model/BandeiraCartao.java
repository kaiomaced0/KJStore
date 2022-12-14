package br.unitins.kj.model;

public enum BandeiraCartao {
	
	VISA(1, "Visa"), 
	MASTERCARD(2, "Master Card"),
	MAESTRO(3, "Maestro"),
	ELO(4, "Elo"),
	ALELO(5, "Alelo"),
	AMERICAN_EXPRESS(6, "American Express"),
	HIPERCARD(7, "Hipercard"),
	DINERS_CLUB(8, "Diners Club");

	private int id;
	private String label;
	
	BandeiraCartao(int id, String label) {
		this.id = id;
		this.label = label;
	}
	
	public int getId() {
		return id;
	}
	
	public String getLabel() {
		return label;
		
	}
	
	public static BandeiraCartao valueOf(Integer id) {
		if (id == null)
			return null;
		for (BandeiraCartao tipo : BandeiraCartao.values()) 
			if (tipo.getId() == id) 
				return tipo;
		return null;
	}	

}
