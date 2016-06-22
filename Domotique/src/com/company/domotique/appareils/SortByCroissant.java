package com.company.domotique.appareils;

import java.util.Comparator;

public class SortByCroissant implements Comparator<AppareilElectrique> {
	
	/**
	 * @param o1,o2 : les objets du Vector � tester
	 * 				  Si la marque de o1 est avant celle de o2 on le place avant, sinon c'est l'inverse
	 * 				  En cas d'�galit�, on compare les mod�les
	 */
	@Override
	public int compare(AppareilElectrique o1, AppareilElectrique o2) {
		int res = 0;
		String sNom1, SNom2;
		
		sNom1=o1.getMarque();
		SNom2=o2.getMarque();
		
		if (sNom1.compareTo(SNom2) < 0) {
			res = -1;
		};
		if (sNom1.compareTo(SNom2) > 0) {
			res = 1;
		};
		
		// Gestion du cas d'�galit�
		if (sNom1.compareTo(SNom2) == 0) {
			sNom1=o1.getModele();
			SNom2=o2.getModele();
			
			if (sNom1.compareTo(SNom2) < 0) {
				res = -1;
			};
			if (sNom1.compareTo(SNom2) > 0) {
				res = 1;
			};
		};
		
		return res;
		}
}
