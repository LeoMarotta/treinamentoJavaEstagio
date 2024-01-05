<%-- 
    Document   : index
    Created on : 5 de jan de 2024, 09:22:29
    Author     : leomarotta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AJAX File Reader</title>
        <script type="text/javascript" src="scripts/default.js"></script>
    </head>
    <body>
        <h1>AJAX File Reader</h1>
        <form id="fileForm">
            <label for="filePath">Local do Disco:</label>
            <input type="text" id="filePath" name="filePath" required>
            <br>
            <label for="fileName">Nome do Arquivo:</label>
            <input type="text" id="fileName" name="fileName" required>
            <br>
            <button type="button" onclick="loadFile()">Carregar Arquivo</button>
        </form>
        <div id="fileContent"></div>
    </body>
</html>