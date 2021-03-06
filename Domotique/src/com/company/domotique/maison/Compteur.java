package com.company.domotique.maison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.exeptions.CompteurADisjoncterException;
import com.company.domotique.inter.ConsommateurDeCourant;
import com.company.domotique.inter.ProducteurDeCourant;

public class Compteur extends AppareilElectrique implements ProducteurDeCourant {

	private Collection<ConsommateurDeCourant> mesAppareilsBranches;
	private int puissanceInstantanee = 0;
	

	public int getPuissanceInstantanee() {
		return puissanceInstantanee;
	}
	
	public int getPuissanceMaxWatts() {
		return puissanceMaxWatts;
	}
	

	public Compteur(String pMarque, String pModele, int pPuissance, int pPuissanceMaxWatt) {
		super(pMarque, pModele, pPuissance);
		this.demarrer();
		super.puissanceMaxWatts=pPuissanceMaxWatt;
		puissanceInstantanee=this.getConsommation();
		mesAppareilsBranches = new ArrayList<ConsommateurDeCourant>();
	}

	@Override
	public void brancher(ConsommateurDeCourant CC) throws CompteurADisjoncterException {
		if ( (puissanceInstantanee+CC.getConsommation()) < puissanceMaxWatts) {
			mesAppareilsBranches.add(CC);
			puissanceInstantanee += (CC.getConsommation());
		}
		else {
			disjoncter();
			throw new CompteurADisjoncterException(this, puissanceInstantanee+CC.getConsommation());
		}
	}

	private void disjoncter() {
		Iterator<ConsommateurDeCourant> appareilCourant = mesAppareilsBranches.iterator();
		while (appareilCourant.hasNext()) {
			AppareilElectrique AEcourant = (AppareilElectrique) appareilCourant.next();
			AEcourant.arreter();
		}
	}

	@Override
	public String toString() {
		return "Compteur [mesAppareilsBranches=" + mesAppareilsBranches + ", puissanceInstantanee="
				+ puissanceInstantanee + "]";
	}
}
