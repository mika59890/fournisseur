package com.mika.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.mika.beans.Utilisateur;

public class ConnexionForms {
	private static final String CHAMP_EMAIL  = "email";
    private static final String CHAMP_PASS   = "password";

    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public Utilisateur connecterUtilisateur( HttpServletRequest request ) {
        /* Récupération des champs du formulaire */
        String email = getValeurChamp( request, CHAMP_EMAIL );
        String password = getValeurChamp( request, CHAMP_PASS );

        Utilisateur utilisateur = new Utilisateur();

        /* Validation du champ email. */
        try {
            validationEmail( email );
            System.out.println("1");
        } catch ( Exception e ) {
            setErreur( CHAMP_EMAIL, e.getMessage() );
            System.out.println("2 "+e.getMessage());
        }
        utilisateur.setEmail( email );
        System.out.println(email);

        /* Validation du champ mot de passe. */
        try {
            validationMotDePasse( password );
            System.out.println("3");
        } catch ( Exception e ) {
            setErreur( CHAMP_PASS, e.getMessage() );
            System.out.println("4 "+e.getMessage());
        }
        utilisateur.setPassword( password );
        System.out.println(password);

        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de la connexion.";
            System.out.println("5");
        } else {
            resultat = "Échec de la connexion.";
            System.out.println("6");
        }

        return utilisateur;
    }

    /**
     * Valide l'adresse email saisie.
     */
    private void validationEmail( String email ) throws Exception {
        if ( email != null && !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
        	System.out.println("7");
            throw new Exception( "Merci de saisir une adresse mail valide." );
            
        }
        
    }

    /**
     * Valide le mot de passe saisi.
     */
    private void validationMotDePasse( String password ) throws Exception {
        if ( password != null ) {
        	System.out.println("8");
            if ( password.length() < 3 ) {
            	System.out.println("9");
                throw new Exception( "Le mot de passe doit contenir au moins 3 caractères." );
            }
        } else {
            throw new Exception( "Merci de saisir votre mot de passe." );
        }
    }

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
        System.out.println("10"+message);
    }

    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
        	System.out.println("11");
            return null;
        } else {
        	System.out.println("12");
            return valeur;
        }
    }
}
