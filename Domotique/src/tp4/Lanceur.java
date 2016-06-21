package tp4;
public class Lanceur {
	
		public static void main(String [] args){
		
		
		System.out.println("Bonjour");
		AppareilElectrique ordinateur = new AppareilElectrique("DELL","GX100",500);
		AppareilThermostate chauffage = new AppareilThermostate("Philips","mod123",250,10,100);


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
				
	}

}
