package com.bankonet.model;

public class CompteCourant {
	
	private int identifiant;
	private String libelle;
	private Float solde;
	private Float decouvertAutorise;
	static int nbComptesCourants = 0;
	
	public CompteCourant(int i, String string, float f, float g) {
		identifiant= i;
		libelle = string;
		solde = f;
		decouvertAutorise = g;
		// TODO Auto-generated constructor stub
		nbComptesCourants++;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Float getSolde() {
		return solde;
	}

	public void setSolde(Float solde) {
		this.solde = solde;
	}

	public Float getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(Float decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
	
	
}

