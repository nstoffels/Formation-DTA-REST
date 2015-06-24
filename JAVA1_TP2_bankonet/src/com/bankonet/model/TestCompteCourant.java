package com.bankonet.model;

public class TestCompteCourant {
	
	public static void main(String[] args) {
	CompteCourant compteCourant1 = new CompteCourant(123456789, "compte_1", 5000.50F, 0.0F);
	CompteCourant compteCourant2 = new CompteCourant(987654321, "compte_2", 20.50F, -1000.0F);
	CompteCourant compteCourant3 = new CompteCourant(789456123, "compte_3", 789.50F, -8000.0F);
	
	System.out.println(CompteCourant.nbComptesCourants);
	System.out.println(compteCourant1.getIdentifiant());
	System.out.println(compteCourant1.getLibelle());
	System.out.println(compteCourant1.getSolde());
	System.out.println(compteCourant1.getDecouvertAutorise());
	}

}
