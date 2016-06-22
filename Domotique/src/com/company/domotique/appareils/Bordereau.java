package com.company.domotique.appareils;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Bordereau extends Vector<AppareilElectrique> {

	Vector<AppareilElectrique> enumAE;
	
	public Bordereau() {
		
	}
	
	public void afficher() {
		for (Enumeration<AppareilElectrique> enumAE = this.elements(); enumAE.hasMoreElements();)
			System.out.println(enumAE.nextElement());
	}
	
	public void triCroissant() {
		Collections.sort(this, new SortByCroissant());
	}
	
	public void triDecroissant() {
		Collections.sort(this, new SortByDecroissant());
	}
}