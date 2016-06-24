package com.company.domotique.inter;

import com.company.domotique.exeptions.CompteurADisjoncterException;

public interface ProducteurDeCourant {
	public void brancher(ConsommateurDeCourant CC) throws CompteurADisjoncterException;
}
