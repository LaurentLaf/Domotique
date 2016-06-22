package com.company.domotique.appareils;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public class Bordereau extends Vector<AppareilElectrique> {

	public Bordereau() {
		
	}
	
	public void afficher() {
		for (Enumeration<AppareilElectrique> enumAE = this.elements(); enumAE.hasMoreElements();)
			System.out.println(enumAE.nextElement());
	}
	
	
}
