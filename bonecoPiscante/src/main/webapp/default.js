/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function blinkEye(eyeId) {
    document.getElementById(eyeId).style.transform = 'scaleY(0.2)';
    setTimeout(function () {
        document.getElementById(eyeId).style.transform = 'scaleY(1)';
    }, 1000);
}

function resetEye(eyeId) {
    document.getElementById(eyeId).style.transform = 'scaleY(1)';
}
