$(document).ready(function(){
    var $email = $('#email'),
    	$password = $('#password'),
    	$confirmation = $('#confirmation'),
    	$nom = $('#nom'),
    	$envoi = $('#envoi');
    
    function verifConfirm(champ){
    	if(champ.val() != ""){
	    	if($(this).val() != $password.val()){ // si la confirmation est différente du mot de passe
	            $(this).css({ // on rend le champ rouge
	    	    borderColor : 'red',
	    	    color : 'red'
            });
    		}
        }
    }
    function verifier(champ){
        if(champ.val() == ""){ // si le champ est vide
            champ.css({ // on rend le champ rouge
        	    borderColor : 'red',
        	    color : 'red'
        	});
        }
    }
    function verifMail(champ)
    {
       var regex = /^[a-zA-Z0-9._-]+@[a-z0-9._-]{2,}\.[a-z]{2,4}$/;
       if(champ.val() != ""){
	       if(!regex.test(champ.value))
	       {
	    	   champ.css({ // on rend le champ rouge
	       	    borderColor : 'red',
	       	    color : 'red'
	    	   });
	       }
       }    
    }
    function verifPass(champ){
    	if(champ.val() != ""){
	    	if($password < 4 || $password > 25){
	    		champ.css({ // on rend le champ rouge
	           	    borderColor : 'red',
	           	    color : 'red'
	        	   });
	    	}
    	}	
    }
    /*Validation nouvel utilisateur*/
    $envoi.on('click', function(e){
        e.preventDefault(); // on annule la fonction par défaut du bouton d'envoi

        // puis on lance la fonction de vérification sur tous les champs :
        verifier($email);
        verifier($password);
        verifier($confirmation);
        verifier($nom);
        verifMail($email);
        verifPass($password);
        verifConfirm($confirmation);
    });

});
