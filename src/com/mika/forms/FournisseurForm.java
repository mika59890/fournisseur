package com.mika.forms;

import javax.servlet.http.HttpServletRequest;

import com.mika.beans.Fournisseur;

public class FournisseurForm {
	
	public Fournisseur inscrireFournisseur( HttpServletRequest request ) {
    
		Fournisseur fournisseur = new Fournisseur();
		
		String enseigne = request.getParameter("enseigne");
		String adresse = request.getParameter("adresse");
		String codePostal = request.getParameter("codePostal");
		String ville = request.getParameter("ville");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		String siret = request.getParameter("siret");
		
		fournisseur.setEnseigne(enseigne);
		fournisseur.setAdresse(adresse);
		fournisseur.setCodePostal(codePostal);
		fournisseur.setVille(ville);
		fournisseur.setTelephone(telephone);
		fournisseur.setEmail(email);
		fournisseur.setSiret(siret);
		
		return fournisseur;
	}
}
