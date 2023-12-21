/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function blinkLeftEye() {
    document.getElementById('left-eye').style.transform = 'scaleY(0.2)';
    setTimeout(function () {
        document.getElementById('left-eye').style.transform = 'scaleY(1)';
    }, 1000);
}

function resetLeftEye() {
    document.getElementById('left-eye').style.transform = 'scaleY(1)';
}

