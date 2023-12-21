<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                background-color: orange;
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
                margin: 0;
            }
            .blue-square {
                position: relative;
                width: 300px;
                height: 300px;
                background-color: blue;
            }
            .eye {
                position: absolute;
                width: 50px;
                height: 50px;
                background-color: lightgreen;
            }
            .eye.left {
                top: 50px;
                left: 50px;
            }
            .eye.right {
                top: 50px;
                right: 50px;
            }
            .nose {
                position: absolute;
                width: 20px;
                height: 50px;
                background-color: lightskyblue;
                top: 120px;
                left: 140px;
            }
            .mouth {
                position: absolute;
                width: 100px;
                height: 10px;
                background-color: yellow;
                top: 210px;
                left: 100px;
            }
        </style>
    </head>
    <body>
        <div class="blue-square">
            <div class="eye left"></div>
            <div class="eye right"></div>
            <div class="nose"></div>
            <div class="mouth"></div>
        </div>
    </body>
</html>
