<%-- 
    Document   : index
    Created on : 28 de dez de 2023, 11:03:12
    Author     : leomarotta
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Escolha um buscador</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Escolha um buscador</h1>

    <form action='/SeuProjeto/RedirecionaPesquisa' method='post'>
        <input type='submit' name='buscador' value='Google' ${checked('Google')}/> Google<br>
        <input type='submit' name='buscador' value='Yahoo' ${checked('Yahoo')}/> Yahoo<br>
        <input type='submit' name='buscador' value='Bing' ${checked('Bing')}/> Bing<br>
        <input type='submit' name='buscador' value='Cade' ${checked('Cade')}/> Cade<br>
    </form>
</body>
</html>