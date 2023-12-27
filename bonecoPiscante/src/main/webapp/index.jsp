<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <script src="default.js"></script>
    <style>
        .eye {
            transition: transform 0.5s;
        }
    </style>
</head>
<body>
<div class="blue-square">
    <div class="eye left" id="left-eye"></div>
    <div class="eye right" id="right-eye"></div>
    <div class="nose"></div>
    <div class="mouth" onmouseover="<%= "blinkEye('" + request.getAttribute("olhoPiscar") + "-eye')" %>"
         onmouseout="resetEye('<%= request.getAttribute("olhoPiscar") + "-eye" %>')"></div>
</div>
<p id="hora">Hora do servidor: <%= request.getAttribute("horaAtual") %></p>
</body>
</html>
