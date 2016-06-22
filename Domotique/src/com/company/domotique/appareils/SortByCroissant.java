package com.company.domotique.appareils;

import java.util.Comparator;

public class SortByCroissant implements Comparator<AppareilElectrique> {

	@Override
	public int compare(AppareilElectrique o1, AppareilElectrique o2) {
		int res = 0;
		
		String sNom1, SNom2;
		
		sNom1=o1.getMarque();
		SNom2=o2.getMarque();
		
		if (sNom1.compareTo(SNom2) < 0) {
			
		};

		
		
		
		return 0;
	}
	
}
