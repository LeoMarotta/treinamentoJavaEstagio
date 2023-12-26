<%@page contentType="text/html" pageEncoding="UTF-8"%>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gremista ou Colorado?</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <div class="container">
            <h1>Gremista ou Colorado?</h1>
            <form method="post" action="ServletGC">
                <button type="submit" name="club" value="gremio">Gremista</button>
                <button type="submit" name="club" value="internacional">Colorado</button>
            </form>
        </div>
    </body>
</html>