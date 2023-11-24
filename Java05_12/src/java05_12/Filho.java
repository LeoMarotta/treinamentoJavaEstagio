/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java05_12;

/**
 *
 * @author leomarotta
 */
public class Filho extends Pai{
    public Filho(){
        this("Classe Filho instanciada sem mensagem");
    }
    public Filho(String msg){
        System.out.println("Classe Filho instanciada: "+ msg);
    }
}