<%-- 
    Document   : index
    Created on : 28 de dez de 2023, 11:03:12
    Author     : leomarotta
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Escolha um buscador</title>
    <link rel="stylesheet" type="text/css" href="styles/style.css">
    <script type="text/javascript" src="default.js"></script>
</head>
<body>
    <div class="container">
        <h1>Escolha um buscador</h1>

        <form method='post' action='RedirecionaPesquisa'>
            <div class="options-container">
                <label><input type='radio' name='buscador' value='Google'/> Google</label>
                <label><input type='radio' name='buscador' value='Yahoo'/> Yahoo</label>
                <label><input type='radio' name='buscador' value='Bing'/> Bing</label>
                <label><input type='radio' name='buscador' value='Cade'/> Cade</label>
            </div>

            <input type='submit' value='Ir!' />
        </form>
    </div>
</body>
</html>
