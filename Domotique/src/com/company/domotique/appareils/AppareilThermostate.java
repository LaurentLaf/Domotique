package com.company.domotique.appareils;

/**
 * @author LaurentL
 */

public class AppareilThermostate extends AppareilElectrique {

	
	private int puissanceInstantanee = 0;
	private int incPuissance = 20;
	private int valeurThermostat = 0;
	private int valeurThermostatMax = 0;

	//Getters et setters
	public int getValeurThermostat() {
		return valeurThermostat;
	}
	public void setValeurThermostat(int iValeurThermostat) {
		this.valeurThermostat = iValeurThermostat;
	}

	public int getPuissanceInstantanee() {
		return puissanceInstantanee;
	}
	public void setPuissanceInstantanee(int pPuissanceInstantanee) {
		this.puissanceInstantanee = pPuissanceInstantanee;
	}

	public int getIncPuissance() {
		return incPuissance;
	}
	public void setIncPuissance(int incPuissance) {
		this.incPuissance = incPuissance;
	}

	public int getValeurThermostatMax() {
		return valeurThermostatMax;
	}
	public void setValeurThermostatMax(int valeurThermostatMax) {
		this.valeurThermostatMax = valeurThermostatMax;
	}

	//Constructeur
	public AppareilThermostate(String pMarque, String pModele, int pPuissance, int pValeurThermostatMax, int pIncPuissance) {
		super(pMarque, pModele, pPuissance);
		this.valeurThermostatMax=pValeurThermostatMax;
		this.incPuissance=pIncPuissance;
		this.valeurThermostat=0;
	}
	
	/**
	 * ne change que la valeur du thermostat
	 */
	public void incrementerThermostat() {
		if (valeurThermostat < valeurThermostatMax) {
			this.valeurThermostat++;
		}
	}
	
	public void decrementerThermostat() {
		if (valeurThermostat > 0) {
			this.valeurThermostat--;
		}
	}
	
	public int getConsommation() {
		int conso=0;
		if (super.isEnMarche) {
			conso = this.incPuissance*this.valeurThermostat;
		}
		return conso;
	}
	
	
	
	@Override
	public void arreter() {
		super.arreter();
		this.setValeurThermostat(0);
	}
	@Override
	public String toString() {
		return super.toString() + "AppareilThermostate [puissanceInstantanee=" + puissanceInstantanee + ", incPuissance=" + incPuissance
				+ ", valeurThermostat=" + valeurThermostat + ", valeurThermostatMax=" + valeurThermostatMax + "]";
	}
	
	
}
