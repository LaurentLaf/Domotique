package com.company.domotique.appareils;

import java.util.Comparator;

public class SortByDecroissant implements Comparator<AppareilElectrique> {

	public SortByDecroissant() {}

	/**
	 * @param o1,o2 : les objets du Vector à tester
	 * 				  Si la marque de o1 est avant celle de o2 on le place APRES, sinon c'est l'inverse
	 * 				  En cas d'égalité, on compare les modèles
	 */
	@Override
	public int compare(AppareilElectrique pObjet1, AppareilElectrique pObjet2) {
		int res = 0;
		String sNom1, SNom2;
		
		sNom1=pObjet1.getMarque();
		SNom2=pObjet2.getMarque();
		
		if (sNom1.compareTo(SNom2) < 0) {
			res = 1;
		};
		if (sNom1.compareTo(SNom2) > 0) {
			res = -1;
		};
		
		// Gestion du cas d'égalité
		if (sNom1.compareTo(SNom2) == 0) {
			sNom1=pObjet1.getModele();
			SNom2=pObjet2.getModele();
			
			if (sNom1.compareTo(SNom2) < 0) {
				res = 1;
			};
			if (sNom1.compareTo(SNom2) > 0) {
				res = -1;
			};
		};
		
		return res;
		}
}
