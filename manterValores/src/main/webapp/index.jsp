<%-- 
    Document   : index
    Created on : 2 de jan de 2024, 15:20:46
    Author     : leomarotta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Loja Online</title>
</head>
<body>
    <h2>Produtos disponíveis:</h2>
    <div>
        <p>Pão - R$ 2,00</p>
        <form action="ValoresServlet" method="post">
            <input type="hidden" name="produto" value="Pão">
            <input type="hidden" name="valor" value="2">
            <input type="submit" value="Adicionar ao Carrinho">
        </form>
    </div>

    <div>
        <p>Donut - R$ 15,00</p>
        <form action="ValoresServlet" method="post">
            <input type="hidden" name="produto" value="Donut">
            <input type="hidden" name="valor" value="15">
            <input type="submit" value="Adicionar ao Carrinho">
        </form>
    </div>

    <div>
        <p>Bolo - R$ 35,00</p>
        <form action="ValoresServlet" method="post">
            <input type="hidden" name="produto" value="Bolo">
            <input type="hidden" name="valor" value="35">
            <input type="submit" value="Adicionar ao Carrinho">
        </form>
    </div>
</body>
</html>