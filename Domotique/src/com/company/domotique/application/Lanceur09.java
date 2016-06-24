package com.company.domotique.application;

import java.util.ArrayList;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilThermostate;
import com.company.domotique.ihm.CadreGeneral;
import com.company.domotique.maison.Compteur;

public class Lanceur09 {

		
	public static void main(String[] args) {
	
		ArrayList alAppElec = new ArrayList();
		ArrayList alAppThermos = new ArrayList();
		

		AppareilElectrique unOrdinateur = new AppareilElectrique("DELL","GX100",501);
		AppareilThermostate unMicroOnde = new AppareilThermostate("Philips","mod123",250,10,100);
		Compteur unCompteurEDF = new Compteur("BOSH", "X1135", 100, 1250);
		//System.out.println(unCompteurEDF.getPuissanceInstantanee());

		//unOrdinateur.demarrer();
		//unMicroOnde.demarrer();
		//unCompteurEDF.brancher(unOrdinateur);
		//unCompteurEDF.brancher(unMicroOnde);
			
		CadreGeneral monInterface = new CadreGeneral(unOrdinateur, unMicroOnde, unCompteurEDF);
	}
}
