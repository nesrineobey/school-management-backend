package com.sesame.GestionEcolePrimaire.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Classe {

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String code;
	  private String libelle;
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Classe [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classe(long id, String code, String libelle, String codeSpecialite, String codeDomaine, String codeCycle) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		
	}  
}
