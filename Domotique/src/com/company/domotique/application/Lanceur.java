package com.company.domotique.application;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.inter.ConsommateurDeCourant;
import com.company.domotique.maison.Compteur;

public class Lanceur {
	
		public static void main(String [] args){
		
		
		Compteur compteur = new Compteur("BOSH", "X1135", 100, 1200);
		
		ConsommateurDeCourant ordinateur = new AppareilElectrique("A","GX102",500);
		ConsommateurDeCourant ordinateur1 = new AppareilElectrique("B","GX102",500);
		ConsommateurDeCourant ordinateur2 = new AppareilElectrique("C","GX102",500);
		
		((AppareilElectrique) ordinateur).demarrer();
		((AppareilElectrique) ordinateur1).demarrer();
		((AppareilElectrique) ordinateur2).demarrer();
		
		compteur.brancher(ordinateur);
		compteur.brancher(ordinateur1);
		compteur.brancher(ordinateur2);
		
		System.out.println(((AppareilElectrique) ordinateur).getIsEnMarche());
		System.out.println(((AppareilElectrique) ordinateur1).getIsEnMarche());
		System.out.println(((AppareilElectrique) ordinateur2).getIsEnMarche());
		
		System.out.println();
		
		
		/*
		//Tests du TP 7
		AppareilElectrique ordinateur = new AppareilElectrique("ASUS","GX102",500);
		AppareilElectrique ordinateur1 = new AppareilElectrique("DELL","GX100",500);
		AppareilElectrique ordinateur2 = new AppareilElectrique("ASUS","GX100",500);
		AppareilElectrique ordinateur3 = new AppareilElectrique("ASUS","GX101",500);
		
		Bordereau bordereau = new Bordereau();
		bordereau.add(ordinateur);
		bordereau.add(ordinateur1);
		bordereau.add(ordinateur2);
		bordereau.add(ordinateur3);
		
		System.out.println("avant tri");
		bordereau.afficher();
		
		bordereau.triCroissant();
		System.out.println("apr�s tri croissant");
		bordereau.afficher();
		
		bordereau.triDecroissant();
		System.out.println("apr�s tri d�croissant");
		bordereau.afficher();
		*/
		
		/*
		System.out.println("Bonjour");
		AppareilElectrique ordinateur = new AppareilElectrique("DELL","GX100",500);
		AppareilThermostate chauffage = new AppareilThermostate("Philips","mod123",250,10,100);

		AppareilSecurise MicroOnde = new AppareilSecurise("Philips", "Modele1", 250, 10, 100, false);
		AppareilSecurise MicroOnde2 = new AppareilSecurise("Philips", "Modele2", 250, 10, 100, true);
		
		MicroOnde.demarrer();
		MicroOnde2.demarrer();
		
		MicroOnde2.desenclencherSecurite();
		MicroOnde2.demarrer();
		
		
		System.out.println(MicroOnde);
		System.out.println(MicroOnde2);
		*/
		
		/*
		// affichage de l'objet chauffage (methode toString appelee par defaut)
		//Verification de l'instanciation
		System.out.println(ordinateur);
		System.out.println(chauffage);

		System.out.println("Marque :" + ordinateur.getMarque()
					 	+ ", Modele : " + ordinateur.getModele());
		System.out.println("Marque :" + chauffage.getMarque() 
						+ ", Modele : " + chauffage.getModele()
					    + ", Thermostat : " + chauffage.getValeurThermostat());

		//Mise en marche chauffage, reglage thermostat
		
		System.out.println(chauffage.getConsommation());
		chauffage.demarrer();
		
		chauffage.setValeurThermostat(7);
		System.out.println(chauffage.getConsommation());
		System.out.println("Chauffage en marche ? : " + chauffage.getIsEnMarche()
						+ ", Thermostat : " + chauffage.getValeurThermostat());
		
		//Tentative d'incrementation du thermostat superieure � son thermostat maxi (12)
		for (int i=0; i<12; i++) {
			chauffage.incrementerThermostat();
		}
		
		// mise en marche de l'ordinateur
		ordinateur.demarrer();

		//etc...................................

	System.out.println("Au revoir!");
	*/
	
	}

}
