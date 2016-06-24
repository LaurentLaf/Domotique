package com.company.domotique.exeptions;

import com.company.domotique.maison.Compteur;

public class CompteurADisjoncterException extends Exception {

	private Compteur compteur;
	private int puissanceDemandee;

	public CompteurADisjoncterException(Compteur pCompteur, int pPuissanceDemandee) {
		super();
		this.compteur = pCompteur;
		this.puissanceDemandee = pPuissanceDemandee;
	}

	public Compteur getCompteur() {
		return compteur;
	}

	public int getPuissanceDemandee() {
		return puissanceDemandee;
	}
	
	public void afficherErreur() {
		System.err.println("Le compteur : "+this.getCompteur().getMarque()+" "
				+ " a disjoncté pour la puissance demandée : "+this.getPuissanceDemandee());
	}
}