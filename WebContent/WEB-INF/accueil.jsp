<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Accueil</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="css/style.css"/>" />
    </head>
    <body>
        <c:import url="inc/header.jsp"/>
        <%-- V�rification de la pr�sence d'un objet utilisateur en session --%>
        <c:if test="${!empty sessionScope.sessionUtilisateur}">
        	<%-- Si l'utilisateur existe en session, alors on affiche son adresse email. --%>
            <p class="succes">Vous �tes connect�(e) avec l'adresse : ${sessionScope.sessionUtilisateur.emailUtilisateur}</p>
        </c:if>
    </body>
</html>