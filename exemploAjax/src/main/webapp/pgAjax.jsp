<%-- 
    Document   : pgAjax
    Created on : 3 de jan de 2024, 10:35:58
    Author     : leomarotta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="scripts/pgajax.js"></script>
    </head>
    <body>
        <input id="txtInput" name="txtInput" type="text" value="" onkeyup="avaliaTecla()"/>
        <div id="txtRetorno" style="position:relative;width: 600px;background-color: blue;color: white"/>
    </body>
</html>