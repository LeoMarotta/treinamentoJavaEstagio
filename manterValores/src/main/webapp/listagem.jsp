<%-- 
    Document   : listagem
    Created on : 2 de jan de 2024, 15:31:57
    Author     : leomarotta
--%>

<%@page import="java.util.Map"%>
<%@page import="controle.Carrinho"%>

<!DOCTYPE html>
<html>
<head>
    <title>Carrinho de Compras</title>
</head>
<body>
    <h2>Produtos no Carrinho:</h2>
    
    <%-- Recupera o carrinho da sessão --%>
    <% Carrinho carrinho = (Carrinho) session.getAttribute("carrinho"); %>
    
    <%-- Verifica se o carrinho está vazio --%>
    <% if (carrinho != null && !carrinho.getProdutos().isEmpty()) { %>
        <ul>
            <%-- Itera sobre os produtos no carrinho --%>
            <% for (Map.Entry<String, Double> entry : carrinho.getProdutos().entrySet()) { %>
                <li><%= entry.getKey() %> - R$ <%= entry.getValue() %></li>
            <% } %>
        </ul>
    <% } else { %>
        <p>Carrinho vazio</p>
    <% } %>
    
    <p><a href="index.jsp">Continuar Comprando</a></p>
</body>
</html>