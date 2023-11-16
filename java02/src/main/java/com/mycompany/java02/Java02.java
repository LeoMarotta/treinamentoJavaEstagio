/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java02;

/**
 *
 * @author leomarotta
 */

class TransformaString {

    public String inverte(String param){
        StringBuilder sb=new StringBuilder();
        for (int i=param.length()-1;i>=0;i--){
            sb.append(param.charAt(i));
        }
        return sb.toString(); // qual o maior valor de i?
    }
}

public class Java02 {

    public static void main(String[] args) {
        String msg="abc teste ovo";
        TransformaString ts=new TransformaString();
        System.out.printf("Msg [%s]\n",ts.inverte(msg));
    }
}
