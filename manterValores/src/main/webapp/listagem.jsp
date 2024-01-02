<%-- 
    Document   : listagem
    Created on : 2 de jan de 2024, 15:31:57
    Author     : leomarotta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map.Entry"%>

<!DOCTYPE html>
<html>
<head>
    <title>Carrinho de Compras</title>
    <link rel="stylesheet" type="text/css" href="styles/style.css">
</head>
<body class="grey-bg">
    <h2>Produtos no Carrinho</h2>

    <table border="1">
        <tr>
            <th>Produto</th>
            <th>Quantidade</th>
            <th>Valor Unitário</th>
            <th>Subtotal</th>
        </tr>
        <%
            // Obtém o carrinho da sessão
            controle.Carrinho carrinho = (controle.Carrinho) session.getAttribute("carrinho");

            if (carrinho != null) {
                // Obtém a lista de produtos no carrinho
                Map<String, Map<String, Object>> produtos = carrinho.getProdutos();

                // Itera sobre os produtos e exibe na tabela
                Set<Entry<String, Map<String, Object>>> entrySet = produtos.entrySet();
                Iterator<Entry<String, Map<String, Object>>> iterator = entrySet.iterator();

                while (iterator.hasNext()) {
                    Entry<String, Map<String, Object>> entry = iterator.next();
                    String produto = entry.getKey();
                    Map<String, Object> item = entry.getValue();
                    int quantidade = (int) item.get("quantidade");
                    double valorUnitario = (double) item.get("valorUnitario");
                    double subtotal = quantidade * valorUnitario;
        %>
                    <tr>
                        <td><%= produto %></td>
                        <td><%= quantidade %></td>
                        <td>R$ <%= valorUnitario %></td>
                        <td>R$ <%= subtotal %></td>
                    </tr>
        <%
                }
            }
        %>
    </table>

    <p>Total: R$ <%= carrinho.getTotal() %></p>

    <p><a href="index.jsp">Continuar Comprando</a></p>
</body>
</html>