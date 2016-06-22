package com.company.domotique.appareils.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.company.domotique.appareils.AppareilThermostate;

public class AppareilThermostateTest {

	@Test
	public void testIncrementerThermostat() {

		AppareilThermostate chauffage = new AppareilThermostate("Philips","mod123",250,10,100);
		chauffage.demarrer();
		
		int valeurThermostat = 5;
		chauffage.setValeurThermostat(valeurThermostat);
		chauffage.incrementerThermostat();
		int nouvelleValeurThermostat = chauffage.getValeurThermostat();
		assertEquals(valeurThermostat+1, nouvelleValeurThermostat);
	}
	
	@Test
	public void testIncrementerThermostatWhenThermostatMax() {
		
		int valeurThermostatMax = 10;
		AppareilThermostate chauffage = new AppareilThermostate("Philips","mod123",250,valeurThermostatMax,100);
		
		int valeurThermostat = 10;
		chauffage.setValeurThermostat(valeurThermostat);
		
		chauffage.incrementerThermostat();
		int nouvelleValeurThermostat = chauffage.getValeurThermostat();
		
		assertEquals(valeurThermostat, nouvelleValeurThermostat);
	}
}