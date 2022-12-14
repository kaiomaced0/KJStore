package br.unitins.kj.model;

public enum Perfil {
	CLIENTE(0, "Cliente"), 
	ADMINISTRADOR(1, "Administrador"), 
	CAIXA(2, "Suporte"), 
	VENDEDOR(3, "Estoque");

	private int id;
	private String label;
	
	Perfil(int id, String label) {
		this.id = id;
		this.label = label;
	}
	
	public int getId() {
		return id;
	}
	
	public String getLabel() {
		return label;
		
	}
	
	public static Perfil valueOf(Integer id) {
		if (id == null)
			return null;
		for (Perfil perfil : Perfil.values()) 
			if (perfil.getId() == id) 
				return perfil;
		return null;
	}
	

}

