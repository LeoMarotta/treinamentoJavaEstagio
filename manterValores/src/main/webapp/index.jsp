<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Loja Online</title>
    <link rel="stylesheet" type="text/css" href="styles/style.css">
</head>
<body class="grey-bg">
    <h2>Produtos disponíveis:</h2>
    <div class="produtos-container">
        <div class="produto">
            <img src="imagem_pao.jpg" alt="Imagem Pão">
            <p>Pão - R$ 2,00</p>
            <form action="ValoresServlet" method="post">
                <input type="hidden" name="produto" value="Pão">
                <input type="hidden" name="valor" value="2">
                <input type="submit" value="Adicionar ao Carrinho">
            </form>
        </div>

        <div class="produto">
            <img src="imagem_donut.jpeg" alt="Imagem Donut">
            <p>Donut - R$ 15,00</p>
            <form action="ValoresServlet" method="post">
                <input type="hidden" name="produto" value="Donut">
                <input type="hidden" name="valor" value="15">
                <input type="submit" value="Adicionar ao Carrinho">
            </form>
        </div>

        <div class="produto">
            <img src="imagem_bolo.jpg" alt="Imagem Bolo">    
            <p>Bolo - R$ 35,00</p>
            <form action="ValoresServlet" method="post">
                <input type="hidden" name="produto" value="Bolo">
                <input type="hidden" name="valor" value="35">
                <input type="submit" value="Adicionar ao Carrinho">
            </form>
        </div>
    </div>
    
    <p class="listagem-link"><a href="ValoresServlet?acao=listagem">Ver Carrinho</a></p>
</body>
</html>
