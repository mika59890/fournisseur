<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription fournisseur</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="css/style.css"/>" />
    </head>
    <body>
    	<c:import url="inc/header.jsp"/>
        <form method="post" action="enregistrementFournisseur">
            <fieldset>
                <legend>Nouveau fournisseur </legend>
                
                <label for="enseigne">Enseigne</label>
                <input type="text" id="enseigne" name="enseigne" value="" size="20" required/>
                <br />
                <label for="adresse">Adresse</label>
                <input type="text" id="adresse" name="adresse" value="" size="20" required/>
                <br />
				<label for="codePostal">Code postal</label>
                <input type="text" id="codePostal" name="codePostal" value="" size="20" required/>
                <br />
                <label for="ville">Ville</label>
                <input type="text" id="ville" name="ville" value="" size="20" required/>
                <br />
                <label for="telephone">Téléphone</label>
                <input type="text" id="telephone" name="telephone" value="" size="20" required/>
                <br />
                <label for="email">Adresse email</label>
                <input type="text" id="email" name="email" value="" size="20" required/>
                <br />
                <label for="siret">Siret</label>
                <input type="number" id="siret" name="siret" value="" size="20" required/>
                <br />
                <input type="submit" value="enregistrementFournisseur" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>