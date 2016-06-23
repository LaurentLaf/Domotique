package com.company.domotique.appareils;

import java.util.Comparator;

public class SortByDecroissant implements Comparator<AppareilElectrique> {

	public SortByDecroissant() {}

	/**
	 * @param o1,o2 : les objets du Vector � tester
	 * 				  Si la marque de o1 est avant celle de o2 on le place APRES, sinon c'est l'inverse
	 * 				  En cas d'�galit�, on compare les mod�les
	 */
	@Override
	public int compare(AppareilElectrique pObjet1, AppareilElectrique pObjet2) {
		int res = 0;
		String sNom1, SNom2;

		sNom1=pObjet1.getMarque();
		SNom2=pObjet2.getMarque();

		res =  -(sNom1.compareTo(SNom2)); 

		// Gestion du cas d'égalité
		if (res == 0) {
			sNom1=pObjet1.getModele();
			SNom2=pObjet2.getModele();

			res =  -(sNom1.compareTo(SNom2)); 
		};
		return res;
	}
}
