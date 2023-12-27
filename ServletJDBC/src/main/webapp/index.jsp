<%-- 
    Document   : newjsp
    Created on : 26 de dez de 2023, 11:48:49
    Author     : leomarotta
--%>

<%@page import="java.util.List"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Servlet com JDBC</title>
</head>
<body>

<%
    List<String> resultados = (List<String>) request.getAttribute("resultados");

    if (resultados == null || resultados.isEmpty()) {
%>
    <h1>Aluno ou funcionário?</h1>
    <h1>Escolha uma opção</h1>
    <ul>
        <li><a href="ServletJDBC?opcao=aluno">Aluno</a></li>
        <li><a href="ServletJDBC?opcao=funcionario">Funcionário</a></li>
    </ul>
<%
    } else {
%>
    <h1>Resultados da Consulta</h1>
    <% 
        for (String resultado : resultados) {
            out.println("<p>" + resultado + "</p>");
        }
    %>
<%
    }
%>

</body>
</html>