<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style/default.css">
        <script src="scripts/default.js"></script> 
        <style>
            .eye {
                transition: transform 0.5s; 
            }
        </style>
    </head>
    <body>
        <div class="blue-square">
            <div class="eye left" id="left-eye" onmouseover="blinkLeftEye()" onmouseout="resetLeftEye()"></div>
            <div class="eye right" id="right-eye"></div>
            <div class="nose"></div>
            <div class="mouth" onmouseover="blinkLeftEye()" onmouseout="resetLeftEye()"></div>
        </div>
    </body>
</html>
