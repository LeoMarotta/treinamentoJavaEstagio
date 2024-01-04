var req;
var isIE;

function initAJAX() {
    if (window.XMLHttpRequest) {
      req = new XMLHttpRequest(); // código para a maioria dos browsers
    } else if (window.ActiveXObject) {
        isIE = true;
        req = new ActiveXObject("Microsoft.XMLHTTP"); // para funcionar no IE
    }
}

function avaliaTecla() {
    initAJAX();
    req.onreadystatechange = retornoAJAX;
    var obj = document.getElementById("txtInput");
    var url = "ajaxerver?conteudo=" + obj.value;
    req.open("GET", url, true);
    req.send(null);
}

function retornoAJAX(){
        if (req.readyState === 4) {
        if (req.status === 200) {
            var elemXML=req.responseXML.documentElement;
            var objRet = document.getElementById("txtRetorno");
            objRet.style.backgroundColor=elemXML.getAttribute("cor");
            objRet.innerHTML=elemXML.childNodes[0].nodeValue;
        }
    }
}