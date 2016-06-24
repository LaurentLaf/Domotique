package com.company.domotique.application;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilThermostate;
import com.company.domotique.exeptions.CompteurADisjoncterException;
import com.company.domotique.ihm.CadreGeneral;
import com.company.domotique.maison.Compteur;

public class Lanceur10 {

	public static void main(String[] args) {
		
		//ArrayList alAppElec = new ArrayList();
		//ArrayList alAppThermos = new ArrayList();

		AppareilElectrique unOrdinateur = new AppareilElectrique("DELL","GX100",501);
		AppareilThermostate unMicroOnde = new AppareilThermostate("Philips","mod123",250,10,100);
		Compteur unCompteurEDF = new Compteur("DELL", "AZ123", 100, 1250);
		
		try {
			unCompteurEDF.brancher(unOrdinateur);
		} catch (CompteurADisjoncterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			unCompteurEDF.brancher(unMicroOnde);
		} catch (CompteurADisjoncterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}

		CadreGeneral monInterface = new CadreGeneral(unOrdinateur, unMicroOnde, unCompteurEDF);
		
	}
}
