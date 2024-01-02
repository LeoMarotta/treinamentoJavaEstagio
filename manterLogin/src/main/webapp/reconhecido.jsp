<%-- 
    Document   : reconhecido
    Created on : 2 de jan de 2024, 08:32:38
    Author     : leomarotta
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bem-vindo</title>
    <link rel="stylesheet" type="text/css" href="styles/style.css">
</head>
<body>
    <div class="header">
        <h2>Bem-vindo</h2>
    </div>
    <div class="container">
        <p>Você está logado como: ${sessionScope.usuarioLogado}</p>
        <form action="ManterLogin" method="post">
            <input type="hidden" name="logout" value="true">
            <input type="submit" value="Logout">
        </form>
    </div>
</body>
</html>