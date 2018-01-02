<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Ajout article</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="css/style.css"/>" />
    </head>
    <body>
    	<c:import url="inc/header.jsp"/>
        <form method="post" action="enregistrementArticle">
            <fieldset>
                <legend>Nouvel article </legend>
                
                <label for="designation">Désignation</label>
                <input type="text" id="designation" name="designation" value="" size="20" required/>
                <br />
                <label for="fournisseur">Fournisseur</label>
                <input type="text" id="fournisseur" name="fournisseur" value="" size="20" required/>
                <br />
                <label for="referenceFournisseur">Référence fournisseur</label>
                <input type="text" id="referenceFournisseur" name="referenceFournisseur" value="" size="20" required/>
                <br />
				<label for="referenceInterne">Référence interne</label>
                <input type="text" id="referenceInterne" name="referenceInterne" value="" size="20" required/>
                <br />
                <label for="matiere">Matière</label>
                <input type="text" id="matiere" name="matiere" value="" size="20"/>
                <br />
                <label for="couleur">Couleur</label>
                <input type="text" id="couleur" name="couleur" value="" size="20"/>
                <br />
                <p>Dimensions (en mm) :</p>
                <label for="hauteur">Hauteur</label>
                <input type="text" id="hauteur" name="hauteur" value="" size="20"/>
                <br />
                <label for="largeur">Largeur</label>
                <input type="text" id="largeur" name="largeur" value="" size="20"/>
                <br />
                <label for="longueur">Longueur</label>
                <input type="number" id="longueur" name="longueur" value="" size="20"/>
                <br />
                <label for="diametre">Diamètre</label>
                <input type="number" id="diametre" name="diametre" value="" size="20"/>
                <br />
                <input type="submit" value="Valider" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>