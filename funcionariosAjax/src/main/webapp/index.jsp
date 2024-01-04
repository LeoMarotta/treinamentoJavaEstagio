<%-- 
    Document   : index.jsp
    Created on : 4 de jan de 2024, 08:53:20
    Author     : leomarotta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Consulta de Nomes de Funcionários</title>
    <script src="scripts/default.js" defer></script>
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>
    <h1>Consulta de Nomes de Funcionários</h1>
    <label for="nomeFuncionario">Digite o nome do funcionário:</label>
    <input type="text" id="nomeFuncionario" onkeyup="consultarNomes()">
    <div id="resultado"></div>
</body>