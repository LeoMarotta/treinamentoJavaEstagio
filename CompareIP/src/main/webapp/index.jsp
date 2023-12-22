<%-- 
    Document   : index
    Created on : 22 de dez de 2023, 09:26:18
    Author     : leomarotta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type='text/css' href='style.css'>
        <title>Comparação de IP</title>
    </head>
    <body>
        <h1>${statusCliente}</h1>
        <p>IP do Cliente: ${ipCliente}</p>
        <p>IP do Servidor: ${ipServidor}</p>
        <p>Hora da Conexão: ${horaConexao}</p>
        <p>Idioma do Cliente: ${idiomaCliente}</p>
    </body>
</html>