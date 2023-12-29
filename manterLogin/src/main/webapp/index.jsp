<%-- 
    Document   : index
    Created on : 29 de dez de 2023, 10:21:23
    Author     : leomarotta
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="styles/style.css">

</head>
<body>
    <div class="header">
        <h2>Quacker Corp</h2>
    </div>
    <div class="container">
        <form action="LoginServlet" method="post">
            <label for="usuario">Usuário:</label>
            <input type="text" id="usuario" name="usuario" required><br>
            <label for="senha">Senha:</label>
            <input type="password" id="senha" name="senha" required><br>
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>