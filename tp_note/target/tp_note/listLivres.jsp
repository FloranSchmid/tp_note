<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Livres</title>
</head>
<body>
    <table>
        <tr>
            <th>Titre</th>
            <th>Auteur</th>
            <th>Emprunter/Rendre</th>
        </tr>
        <c:forEach items="${requestScope.LISTE_LIVRES}" var="livre">
            <tr>
                <td>${livre.titreLivre}</td>
                <td>${livre.auteurLivre}</td>
                <a href="reservation"><td name="id">${livre.freeLivre}</td></a>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
