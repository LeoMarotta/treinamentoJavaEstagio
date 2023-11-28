// Linguagem: Java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package treino.java06_02;

/**
 *
 * @author leomarotta
 */
public class Java06_02 {

    public static void main(String[] args) {
        
        System.out.println(" ---- ");
        System.out.println("Entrando no primeiro bloco TRY");
        
        try {
            System.out.println("Entrando no segundo bloco TRY");
            try {
                throw new MinhaException();
            } finally {
                System.out.println("FINALLY do segundo bloco TRY");
            }
        } catch (MinhaException e) {
            System.out.println("Capturando MinhaException no primeiro bloco TRY");
        } finally {
            System.out.println("FINALLY do primeiro bloco TRY");
            System.out.println(" ---- ");
        }
    
    }
}
