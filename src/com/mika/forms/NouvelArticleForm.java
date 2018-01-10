package com.mika.forms;

import java.util.HashMap;
import java.util.Map;

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
	    private Map<String, String> erreurs      = new HashMap<String, String>();
	    
	    public String getResultat() {
	        return resultat;
	    }    
	    public Map<String, String> getErreurs() {
	        return erreurs;
	    }
	    public Article ajouterArticle( HttpServletRequest request ) {

	    	String designation = getValeurChamp( request, CHAMP_DESIGNATION );
	    	String fournisseur = getValeurChamp( request, CHAMP_FOURNISSEUR );
	    	String referenceFournisseur = getValeurChamp( request, CHAMP_REFERENCE_FOURNISSEUR );
	    	String referenceInterne = getValeurChamp( request, CHAMP_REFERENCE_INTERNE );
	    	String matiere = getValeurChamp( request, CHAMP_MATIERE );
	    	String couleur = getValeurChamp( request, CHAMP_COULEUR );
	    	String lot = getValeurChamp( request, CHAMP_LOT );
	    	String prixHT = getValeurChamp( request, CHAMP_PRIX_HT );
	    	String hauteur = getValeurChamp( request, CHAMP_HAUTEUR );
	    	String longueur = getValeurChamp( request, CHAMP_LONGUEUR );
	    	String largeur = getValeurChamp( request, CHAMP_LARGEUR );
	    	String diametre = getValeurChamp( request, CHAMP_DIAMETRE );
	    	
	    	Article article = new Article();
	    	
	    	try {
	            validationChamp( designation );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_DESIGNATION, e.getMessage() );
	        }
	    	article.setDesignation(designation);
	    	try {
	            validationChamp( fournisseur );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_FOURNISSEUR, e.getMessage() );
	        }
	    	article.setFournisseur(fournisseur);
	    	try {
	            validationChamp( referenceFournisseur );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_REFERENCE_FOURNISSEUR, e.getMessage() );
	        }
	    	article.setReferenceFournisseur(referenceFournisseur);
	    	try {
	            validationChamp( referenceInterne );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_REFERENCE_INTERNE, e.getMessage() );
	        }
	    	article.setReferenceInterne(referenceInterne);
	    	try {
	            validationChamp( matiere );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_MATIERE, e.getMessage() );
	        }
	    	article.setMatiere(matiere);
	    	try {
	            validationChamp( couleur );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_COULEUR, e.getMessage() );
	        }
	    	article.setCouleur(couleur);
	    	try {
	            validationChamp( lot );
	            validationChiffre( lot );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_LOT, e.getMessage() );
	        }
	    	article.setLot(lot);
	    	try {
	            validationChamp( prixHT );
	            validationChiffre( prixHT );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_PRIX_HT, e.getMessage() );
	        }
	    	article.setPrixHT(prixHT);
	    	try {
	            validationChiffre( hauteur );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_HAUTEUR, e.getMessage() );
	        }
	    	article.setHauteur(hauteur);
	    	try {
	            validationChiffre( longueur );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_LONGUEUR, e.getMessage() );
	        }
	    	article.setLongueur(longueur);
	    	try {
	            validationChiffre( largeur );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_LARGEUR, e.getMessage() );
	        }
	    	article.setLargeur(largeur);
	    	try {
	            validationChiffre( diametre );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_DIAMETRE, e.getMessage() );
	        }
	    	article.setDiametre(diametre);
	    	
	    	return article;
	    }
	    private void validationChamp( String champ ) throws Exception {
	        if ( champ == null ) {
	            throw new Exception( "Champ obligatoire." );
	        }
	    }
	    private void validationChiffre( String chiffre ) throws Exception {
	        if ( chiffre != null ) {
	            if ( !chiffre.matches( "([0-9.]{1,})" ) ) {
	                throw new Exception( "Merci de saisir un nombre." );
	            }
	        }
	    }
	    private void setErreur( String champ, String message ) {
	        erreurs.put( champ, message );
	    }
		private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
	        String valeur = request.getParameter( nomChamp );
	        if ( valeur == null || valeur.trim().length() == 0 ) {
	            return null;
	        } else {
	            return valeur.trim();
	        }
	    }
}
