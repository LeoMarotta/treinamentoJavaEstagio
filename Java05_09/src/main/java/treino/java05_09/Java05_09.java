/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package treino.java05_09;

/**
 *
 * @author leomarotta
 */
public class Java05_09 {

    public static void main(String[] args) {
 
        Conta Teste = new Conta(123,100.00);
        System.out.println("O numero da conta: " + Teste.getConta());
        System.out.println("O valor na conta: " + Teste.getSaldo());
        
        System.out.println("\n" + Teste.toString());
        
        Conta c1 = new Conta(10,0.0);
        Conta c2 = new Conta(10,5.50);
        System.out.println(c1.equals(c2));
    }
}
