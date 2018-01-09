$(document).ready(function(){
    var $email = $('#email'),
    	$emailJQuery = $('#emailJQuery'),
    	$password = $('#password'),
    	$passwordJQuery = $('#passwordJQuery'),
    	$confirmation = $('#confirmation'),
    	$confirmationJQuery = $('#confirmationJQuery'),
    	$nom = $('#nom'),
    	$envoi = $('#envoi');
    
    function verifConfirm(){
    	if($confirmation.val() != ""){
	    	if($confirmation.val() != $password.val()){ // si la confirmation est différente du mot de passe
	    		$confirmation.css({ // on rend le champ rouge
	    	    borderColor : '#900',
	    	    color : '#900'});
	            $confirmationJQuery.html("<span>Les mots de passe entrés sont différents, merci de les saisir à nouveau.</span>");
    		}else{
    			$confirmation.css({ 
    	    	    borderColor : '#999',
    	    	    color : 'black'});
    	            $confirmationJQuery.html("");
    		}
        }else{
     	   verifier($confirmation);
        }
    }
    function verifier(champ){
        if(champ.val() == ""){ // si le champ est vide
            champ.css({ // on rend le champ rouge
        	    borderColor : '#900',
        	    color : '#900'});
        }
    }
    function verifNom(){
    	if($nom.val() != ""){
    		$nom.css({ // on rend le champ rouge
	       	    borderColor : '#999',
	       	    color : 'black'});
    	}else{
     	   verifier($nom);
        }
    }
    function verifMail(){
       if($email.val() != ""){
       var regex = /^.+@.+\..+/;
	       if(!regex.test($email.value))
	       {
	    	   $email.css({ // on rend le champ rouge
	       	    borderColor : '#900',
	       	    color : '#900'});
	    	   $emailJQuery.html("<span>Merci de saisir une adresse mail valide.</span>");
	       }else{
	    	   $email.css({ 
		    	borderColor : '#999',
		    	color : 'black'});
		       $emailJQuery.html("");
	       }
       }else{
    	   verifier($email);
       }    
    }
    function verifPass(){
    	if($password.val() != ""){
	    	if($password.val().length < 4 ){
	    		$password.css({ // on rend le champ rouge
	           	    borderColor : '#900',
	           	    color : '#900'});
	    	$passwordJQuery.html("<span>Les mots de passe doivent contenir au moins 4 caractères.</span>");
	    	}else{
	    		$password.css({ 
		    	    borderColor : '#999',
		    	    color : 'black'});
		            $passwordJQuery.html("");
	    	}
    	}else{
     	   verifier($password);
        }	
    }
    /*Validation nouvel utilisateur*/
    $envoi.click(function(e){
        e.preventDefault(); // on annule la fonction par défaut du bouton d'envoi

        // puis on lance les fonctions de vérification
        verifMail();
        verifPass();
        verifConfirm();
        verifNom();
    });

});
