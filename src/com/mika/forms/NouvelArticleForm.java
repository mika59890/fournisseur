package com.mika.forms;

import javax.servlet.http.HttpServletRequest;

import com.mika.beans.Article;

public class NouvelArticleForm {
		private static final String CHAMP_DESIGNATION = "designation";
		private static final String CHAMP_FOURNISSEUR = "fournisseur";
		private static final String CHAMP_REFERENCE_FOURNISSEUR = "referenceFournisseur";
		private static final String CHAMP_REFERENCE_INTERNE = "referenceInterne";
		private static final String CHAMP_MATIERE = "matiere";
		private static final String CHAMP_COULEUR = "couleur";
		private static final String CHAMP_LOT = "lot";
	    private static final String CHAMP_PRIX_HT = "prixHT";
	    private static final String CHAMP_HAUTEUR = "hauteur";
	    private static final String CHAMP_LONGUEUR = "longueur";
	    private static final String CHAMP_LARGEUR = "largeur";
	    private static final String CHAMP_DIAMETRE = "diametre";
	    private String resultat;
	    
	    public String getResultat() {
	        return resultat;
	    }    

	    public Article ajouterArticle( HttpServletRequest request ) {

	    	String designation = request.getParameter( CHAMP_DESIGNATION );
	    	String fournisseur = request.getParameter( CHAMP_FOURNISSEUR );
	    	String referenceFournisseur = request.getParameter( CHAMP_REFERENCE_FOURNISSEUR );
	    	String referenceInterne = request.getParameter( CHAMP_REFERENCE_INTERNE );
	    	String matiere = request.getParameter( CHAMP_MATIERE );
	    	String couleur = request.getParameter( CHAMP_COULEUR );
	    	String lot = request.getParameter( CHAMP_LOT );
	    	String prixHT = request.getParameter( CHAMP_PRIX_HT );
	    	String hauteur = request.getParameter( CHAMP_HAUTEUR );
	    	String longueur = request.getParameter( CHAMP_LONGUEUR );
	    	String largeur = request.getParameter( CHAMP_LARGEUR );
	    	String diametre = request.getParameter( CHAMP_DIAMETRE );
	    	
	    	Article article = new Article();
	    	
	    	article.setDesignation(designation);
	    	article.setFournisseur(fournisseur);
	    	article.setReferenceFournisseur(referenceFournisseur);
	    	article.setReferenceInterne(referenceInterne);
	    	article.setMatiere(matiere);
	    	article.setCouleur(couleur);
	    	article.setLot(lot);
	    	article.setPrixHT(prixHT);
	    	article.setHauteur(hauteur);
	    	article.setLongueur(longueur);
	    	article.setLargeur(largeur);
	    	article.setDiametre(diametre);
	    	
	    	resultat = "Article enregistré";
	    	
	    	return article;
	    }
}
