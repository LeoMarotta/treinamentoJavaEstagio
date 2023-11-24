/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java02_05;

/**
 *
 * @author leomarotta
 * 
 */

/**
 * 
 * Quinto exercicio de Java. Criando métodos para a classes dada.
 */

class Matematica {
    private int valor;
    
    public int getValor(){
        return valor;
    }
    public void setValor(int val){
        valor = val;
    }
    public void dobra(){
        valor = valor * 2;
    }
    public void quadruplica(){
        valor = valor * 4;
    }
    public void soma(int numero){
        valor = valor + numero;
    }
}

public class Java02_05 {

    public static void main(String[] args) {
        
        Matematica mat=new Matematica();
        
        mat.setValor(10);
        
        mat.dobra();
        
        if (mat.getValor()!=20){
            System.out.println(" --- Erro, método dobra() não funciona");
            System.exit(1);
        }
        
        mat.setValor(34);
        
        mat.quadruplica();
        
        if (mat.getValor()!=136){
            System.out.println(" --- Erro, método quadruplica() não funciona");
            System.exit(2);
        }
        
        mat.soma(4);
        
        if (mat.getValor()!=140){
            System.out.println(" --- Erro, método soma(int) não funciona");
            System.exit(3);
        }
        
        System.out.println(" --- Todos os testes foram bem sucedidos!");
    }
}
