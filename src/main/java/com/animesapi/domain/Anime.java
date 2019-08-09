package com.animesapi.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anime implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String estilo;
	private long numeroEp;

	public Anime() {

	}

	public Anime(String nome, String estilo, long numeroEp) {
		super();
		this.nome = nome;
		this.estilo = estilo;
		this.numeroEp = numeroEp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public long getNumeroEp() {
		return numeroEp;
	}

	public void setNumeroEp(long numeroEp) {
		this.numeroEp = numeroEp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
