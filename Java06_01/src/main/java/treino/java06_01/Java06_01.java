// Linguagem: Java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package treino.java06_01;

/**
 *
 * @author leomarotta
 */
public class Java06_01 {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
        }
    
    
        static void metodo1() {
            System.out.println("inicio do metodo1");
            metodo2();
            System.out.println("fim do metodo1");
        }
        
        
        static void metodo2() {
            System.out.println("inicio do metodo2");
            int[] array = new int[10];
            for(int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
            System.out.println("fim do metodo2");
        }
        
}
