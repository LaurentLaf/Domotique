package com.company.domotique.appareils;

public class AppareilSecurise extends AppareilThermostate {

	private boolean isSecuriteEnclenchee = false;
	
	//Accesseurs et Mutateurs
	public boolean isSecuriteEnclenchee() {
		return isSecuriteEnclenchee;
	}
	public void setSecuriteEnclenchee(boolean isSecuriteEnclenchee) {
		this.isSecuriteEnclenchee = isSecuriteEnclenchee;
	}

	//Constructeur
	public AppareilSecurise(String pMarque, String pModele, int pPuissance, int pValeurThermostatMax, int pIncPuissance, boolean pIsSecuriteEnclenchee) {
		super(pMarque, pModele, pPuissance, pValeurThermostatMax, pIncPuissance);
		this.setSecuriteEnclenchee(pIsSecuriteEnclenchee);
	}
	
	@Override
	public void demarrer() {
		if (!isSecuriteEnclenchee()) {
			super.demarrer();
		}
	}
	
	public void desenclencherSecurite() {
		this.setSecuriteEnclenchee(false);
	}
	
	public void enclencherSecurite() {
		this.setSecuriteEnclenchee(true);
	}
	@Override
	public String toString() {
		return super.toString() + "AppareilSecurise [isSecuriteEnclenchee=" + isSecuriteEnclenchee + "]";
	}
}
