<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Ajout article</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="css/style.css"/>" />
        <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="js/validation.js"></script>
    </head>
    <body>
    	<c:import url="inc/header.jsp"/>
        <form method="post" action="NouvelArticle" enctype="multipart/form-data">
            <fieldset>
                <legend>Nouvel article </legend>
                
                <label for="designation">Désignation <span class="requis">*</span></label>
                <input type="text" id="designation" name="designation" value="<c:out value="${article.designation}"/>" size="20" />
                <span class="erreur" id="designationJQuery">${form.erreurs['designation']}</span>
                <br />
                <label for="fournisseur">Fournisseur <span class="requis">*</span></label>
                <input type="text" id="fournisseur" name="fournisseur" value="<c:out value="${article.fournisseur}"/>" size="20" />
                <span class="erreur" id="fournisseurJQuery">${form.erreurs['fournisseur']}</span>
                <br />
                <label for="referenceFournisseur">Référence fournisseur <span class="requis">*</span></label>
                <input type="text" id="referenceFournisseur" name="referenceFournisseur" value="<c:out value="${article.referenceFournisseur}"/>" size="20" />
                <span class="erreur" id="referenceFournisseurJQuery">${form.erreurs['referenceFournisseur']}</span>
                <br />
				<label for="referenceInterne">Référence interne <span class="requis">*</span></label>
                <input type="text" id="referenceInterne" name="referenceInterne" value="<c:out value="${article.referenceInterne}"/>" size="20" />
                <span class="erreur" id="referenceInterneJQuery">${form.erreurs['referenceInterne']}</span>
                <br />
                <label for="matiere">Matière <span class="requis">*</span></label>
                <input type="text" id="matiere" name="matiere" value="<c:out value="${article.matiere}"/>" size="20"/>
                <span class="erreur" id="matiereJQuery">${form.erreurs['matiere']}</span>
                <br />
                <label for="couleur">Couleur <span class="requis">*</span></label>
                <input type="text" id="couleur" name="couleur" value="<c:out value="${article.matiere}"/>" size="20"/>
                <span class="erreur" id="couleurJQuery">${form.erreurs['couleur']}</span>
                <br />
                <label for="lot">Vendu par lot de <span class="requis">*</span></label>
                <input type="text" id="lot" name="lot" value="<c:out value="${article.lot}"/>" size="20" />
                <span class="erreur" id="lotJQuery">${form.erreurs['lot']}</span>
                <br />
                <label for="prixHT">Prix HT <span class="requis">*</span></label>
                <input type="text" id="prixHT" name="prixHT" value="<c:out value="${article.prixHT}"/>" size="20" />
                <span class="erreur" id="prixHTJQuery">${form.erreurs['prixHT']}</span>
                <br />
                <p>Dimensions (en mm) :</p>
                <label for="hauteur">Hauteur</label>
                <input type="text" id="hauteur" name="hauteur" value="<c:out value="${article.hauteur}"/>" size="20"/>
                <span class="erreur" id="hauteurJQuery">${form.erreurs['hauteur']}</span>
                <br />
                <label for="largeur">Largeur</label>
                <input type="text" id="largeur" name="largeur" value="<c:out value="${article.largeur}"/>" size="20"/>
                <span class="erreur" id="largeurJQuery">${form.erreurs['largeur']}</span>
                <br />
                <label for="longueur">Longueur</label>
                <input type="text" id="longueur" name="longueur" value="<c:out value="${article.longueur}"/>" size="20"/>
                <span class="erreur" id="longueurJQuery">${form.erreurs['longueur']}</span>
                <br />
                <label for="diametre">Diamètre</label>
                <input type="text" id="diametre" name="diametre" value="<c:out value="${article.diametre}"/>" size="20"/>
                <span class="erreur" id="diametreJQuery">${form.erreurs['diametre']}</span>
                <br />
                <input type="submit" id="envoiArticle" value="Valider" class="sansLabel" />
                <br />
                <p class="succes"><c:out value="${form.resultat}"/></p>
            </fieldset>
        </form>
    </body>
</html>