/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java05_11;

/**
 *
 * @author leomarotta
 */
public class Java05_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Classe1[] x = {new Classe1(),new Classe2()};
        
        for (int i = 0; i < x.length; i++){
            x[i].metodo1();
            x[i].metodo2();
            if(x[i] instanceof Classe2){
                ((Classe2) x[i]).metodo3();
            }
        }
    }
}
