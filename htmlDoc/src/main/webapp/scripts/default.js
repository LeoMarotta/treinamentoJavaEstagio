function loadFile() {
    var filePath = document.getElementById("filePath").value;
    var fileName = document.getElementById("fileName").value;

    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                document.getElementById("fileContent").innerHTML = xhr.responseText;
            } else {
                document.getElementById("fileContent").innerHTML = "Erro ao carregar o arquivo.";
            }
        }
    };

    xhr.open("POST", "htmldoc?filePath=" + encodeURIComponent(filePath) + "&fileName=" + encodeURIComponent(fileName), true);
    xhr.send();
}