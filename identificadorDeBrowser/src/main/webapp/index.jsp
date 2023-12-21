<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Navegador Info</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            color: #333;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }
        #result {
            padding: 20px;
            border: 1px solid #ccc;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
    <div id="result">
        <h2>Informações do Navegador</h2>
        <p><strong>Nome do Navegador:</strong> <span id="browserName"></span></p>
        <p><strong>Versão:</strong> <span id="browserVersion"></span></p>
    </div>

    <script>
        function getBrowserInfo() {
            var ua = navigator.userAgent;
            var browserName;
            var browserVersion;

            if (ua.indexOf("Chrome") !== -1) {
                browserName = "Google Chrome";
                browserVersion = ua.match(/Chrome\/([\d.]+)/)[1];
            } else if (ua.indexOf("Firefox") !== -1) {
                browserName = "Mozilla Firefox";
                browserVersion = ua.match(/Firefox\/([\d.]+)/)[1];
            } else if (ua.indexOf("Safari") !== -1) {
                browserName = "Apple Safari";
                browserVersion = ua.match(/Safari\/([\d.]+)/)[1];
            } else if (ua.indexOf("MSIE") !== -1 || ua.indexOf("Trident") !== -1) {
                browserName = "Internet Explorer";
                browserVersion = ua.match(/(?:MSIE |rv:)(\d+(\.\d+)?)/)[1];
            } else {
                browserName = "Navegador Desconhecido";
                browserVersion = "N/A";
            }

            document.getElementById("browserName").textContent = browserName;
            document.getElementById("browserVersion").textContent = browserVersion;
        }

        window.onload = getBrowserInfo;
    </script>
</body>
</html>
