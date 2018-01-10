package com.mika.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.mika.beans.Fournisseur;

public class FournisseurForm {
	
	private static final String CHAMP_ENSEIGNE  = "enseigne";
    private static final String CHAMP_ADRESSE   = "adresse";
    private static final String CHAMP_CODE_POSTAL   = "codePostal";
    private static final String CHAMP_VILLE    = "ville";
    private static final String CHAMP_TELEPHONE    = "telephone";
    private static final String CHAMP_EMAIL    = "email";
    private static final String CHAMP_SIRET    = "siret";
    
    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }
    public Map<String, String> getErreurs() {
        return erreurs;
    }
	
	public Fournisseur inscrireFournisseur( HttpServletRequest request ) {
		
		String enseigne = getValeurChamp( request, CHAMP_ENSEIGNE );
		String adresse = getValeurChamp( request, CHAMP_ADRESSE );
		String codePostal = getValeurChamp( request, CHAMP_CODE_POSTAL );
		String ville = getValeurChamp( request, CHAMP_VILLE );
		String telephone = getValeurChamp( request, CHAMP_TELEPHONE );
		String email = getValeurChamp( request, CHAMP_EMAIL );
		String siret = getValeurChamp( request, CHAMP_SIRET );
		
		Fournisseur fournisseur = new Fournisseur();
		
		try {
            validationChamp( enseigne );
        } catch ( Exception e ) {
            setErreur( CHAMP_ENSEIGNE, e.getMessage() );
        }
		fournisseur.setEnseigne(enseigne);
		try {
            validationChamp( adresse );
        } catch ( Exception e ) {
            setErreur( CHAMP_ADRESSE, e.getMessage() );
        }
		fournisseur.setAdresse(adresse);
		try {
            validationChamp( codePostal );
        } catch ( Exception e ) {
            setErreur( CHAMP_CODE_POSTAL, e.getMessage() );
        }
		fournisseur.setCodePostal(codePostal);
		try {
            validationChamp( ville );
        } catch ( Exception e ) {
            setErreur( CHAMP_VILLE, e.getMessage() );
        }
		fournisseur.setVille(ville);
		try {
            validationChamp( telephone );
            validationTelephone( telephone );
        } catch ( Exception e ) {
            setErreur( CHAMP_TELEPHONE, e.getMessage() );
        }
		fournisseur.setTelephone(telephone);
		try {
            validationChamp( email );
            validationEmail( email );
        } catch ( Exception e ) {
            setErreur( CHAMP_EMAIL, e.getMessage() );
        }
		fournisseur.setEmail(email);
		try {
            validationChamp( siret );
            validationSiret( siret );
        } catch ( Exception e ) {
            setErreur( CHAMP_SIRET, e.getMessage() );
        }
		fournisseur.setSiret(siret);
		if ( erreurs.isEmpty() ) {
            resultat = "Fournisseur enregistré.";
        } else {
            resultat = "Échec de l'enregistrement.";
        }
		return fournisseur;
	}
	private void validationChamp( String champ ) throws Exception {
        if ( champ == null ) {
            throw new Exception( "Champ obligatoire." );
        }
    }
	private void validationTelephone( String telephone ) throws Exception {
        if ( telephone != null ) {
            if ( !telephone.matches( "([0-9.-_]*)" ) ) {
                throw new Exception( "Merci de saisir un numéro de téléphone valide." );
            }
        }
    }
	private void validationEmail( String email ) throws Exception {
        if ( email != null ) {
            if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
                throw new Exception( "Merci de saisir une adresse mail valide." );
            }
        } else {
            throw new Exception( "Merci de saisir une adresse mail." );
        }
    }
	private void validationSiret( String siret ) throws Exception {
        if ( siret != null ) {
            if ( !siret.matches( "([0-9]{14})" ) ) {
                throw new Exception( "Merci de saisir un numéro de siret valide." );
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
