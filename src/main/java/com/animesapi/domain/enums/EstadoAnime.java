package com.animesapi.domain.enums;

public enum EstadoAnime {
	
	
ACABADO(1, "Acabado"),
EMANDAMENTO(2, "Em Andamento");
	
	
	
private int cod;
private String descricao;


private EstadoAnime(int cod, String descricao) {
	this.cod = cod;
	this.descricao = descricao;
}


public int getCod() {
	return cod;
}


public void setCod(int cod) {
	this.cod = cod;
}


public String getDescricao() {
	return descricao;
}


public void setDescricao(String descricao) {
	this.descricao = descricao;
}



	
	
	
}
