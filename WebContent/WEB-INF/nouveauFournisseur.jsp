<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription fournisseur</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="css/style.css"/>" />
        <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="js/validation.js"></script>
    </head>
    <body>
    	<c:import url="inc/header.jsp"/>
        <form method="post" action="NouveauFournisseur">
            <fieldset>
                <legend>Nouveau fournisseur </legend>
                
                <label for="enseigne">Enseigne <span class="requis">*</span></label>
                <input type="text" id="enseigne" name="enseigne" value="<c:out value="${fournisseur.enseigne}"/>" size="20" maxlength="60"/>
                <span class="erreur" id="enseigneJQuery">${form.erreurs['enseigne']}</span>
                <br />
                <label for="adresse">Adresse <span class="requis">*</span></label>
                <input type="text" id="adresse" name="adresse" value="<c:out value="${fournisseur.adresse}"/>" size="20" maxlength="100"/>
                <span class="erreur" id="adresseJQuery">${form.erreurs['adresse']}</span>
                <br />
				<label for="codePostal">Code postal <span class="requis">*</span></label>
                <input type="text" id="codePostal" name="codePostal" value="<c:out value="${fournisseur.codePostal}"/>" size="20" maxlength="20"/>
                <span class="erreur" id="codePostalJQuery">${form.erreurs['codePostal']}</span>
                <br />
                <label for="ville">Ville <span class="requis">*</span></label>
                <input type="text" id="ville" name="ville" value="<c:out value="${fournisseur.ville}"/>" size="20" maxlength="60"/>
                <span class="erreur" id="villeJQuery">${form.erreurs['ville']}</span>
                <br />
                <label for="telephone">T�l�phone <span class="requis">*</span></label>
                <input type="text" id="telephone" name="telephone" value="<c:out value="${fournisseur.telephone}"/>" size="20" maxlength="20"/>
                <span class="erreur" id="telephoneJQuery">${form.erreurs['telephone']}</span>
                <br />
                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" value="<c:out value="${fournisseur.email}"/>" size="20" maxlength="60"/>
                <span class="erreur" id="emailJQuery">${form.erreurs['email']}</span>
                <br />
                <label for="siret">Siret <span class="requis">*</span></label>
                <input type="number" id="siret" name="siret" value="<c:out value="${fournisseur.siret}"/>" size="20" maxlength="14"/>
                <span class="erreur" id="siretJQuery">${form.erreurs['siret']}</span>
                <br />
                <input type="submit" id="envoiFournisseur" value="Valider" class="sansLabel" />
                <br />
                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
            </fieldset>
        </form>
    </body>
</html>