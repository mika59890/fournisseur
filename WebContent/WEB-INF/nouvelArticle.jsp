<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Ajout article</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="css/style.css"/>" />
    </head>
    <body>
    	<c:import url="inc/header.jsp"/>
        <form method="post" action="NouvelArticle" enctype="multipart/form-data">
            <fieldset>
                <legend>Nouvel article </legend>
                
                <label for="designation">Désignation</label>
                <input type="text" id="designation" name="designation" value="<c:out value="${article.designation}"/>" size="20" required/>
                <br />
                <label for="fournisseur">Fournisseur</label>
                <input type="text" id="fournisseur" name="fournisseur" value="<c:out value="${article.fournisseur}"/>" size="20" required/>
                <br />
                <label for="referenceFournisseur">Référence fournisseur</label>
                <input type="text" id="referenceFournisseur" name="referenceFournisseur" value="<c:out value="${article.referenceFournisseur}"/>" size="20" required/>
                <br />
				<label for="referenceInterne">Référence interne</label>
                <input type="text" id="referenceInterne" name="referenceInterne" value="<c:out value="${article.referenceInterne}"/>" size="20" required/>
                <br />
                <label for="matiere">Matière</label>
                <input type="text" id="matiere" name="matiere" value="<c:out value="${article.matiere}"/>" size="20"/>
                <br />
                <label for="couleur">Couleur</label>
                <input type="text" id="couleur" name="couleur" value="<c:out value="${article.matiere}"/>" size="20"/>
                <br />
                <label for="lot">Vendu par lot de </label>
                <input type="text" id="lot" name="lot" value="<c:out value="${article.lot}"/>" size="20" required/>
                <br />
                <label for="prixHT">Prix HT</label>
                <input type="text" id="prix" name="prixHT" value="<c:out value="${article.prixHT}"/>" size="20" required/>
                <br />
                <p>Dimensions (en mm) :</p>
                <label for="hauteur">Hauteur</label>
                <input type="text" id="hauteur" name="hauteur" value="<c:out value="${article.hauteur}"/>" size="20"/>
                <br />
                <label for="largeur">Largeur</label>
                <input type="text" id="largeur" name="largeur" value="<c:out value="${article.largeur}"/>" size="20"/>
                <br />
                <label for="longueur">Longueur</label>
                <input type="number" id="longueur" name="longueur" value="<c:out value="${article.longueur}"/>" size="20"/>
                <br />
                <label for="diametre">Diamètre</label>
                <input type="number" id="diametre" name="diametre" value="<c:out value="${article.diametre}"/>" size="20"/>
                <br />
                <input type="submit" value="Valider" class="sansLabel" />
                <br />
                <p class="succes"><c:out value="${form.resultat}"/></p>
            </fieldset>
        </form>
    </body>
</html>