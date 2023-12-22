<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gremista ou Colorada?</title>
    </head>
    <body>
        <form method="post" action="ServletGC">
            <label for="club">Você é gremista ou colorado?</label>
            <select name="club" id="club">
                <option value="gremio">Gremista</option>
                <option value="internacional">Colorado</option>
            </select>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
