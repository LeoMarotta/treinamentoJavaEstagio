// Linguagem: Java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java02_02;

/**
 *
 * @author leomarotta
 */


/**
 * 
 * Segundo exercicio de java. Aprendendo debug
 */



public class Java02_02 {

    public static void main(String[] args) {
        
        System.out.printf("\n------ \n");
        int x = 9;
        int y = 26;
        label:
        for (int z = 0; z < 6; z++, y--) {
            if (x > 2) {
                x--;
            }
            if (x > 5) {
                System.out.printf("%d ", x);
                --x;
                continue label;
            }
            x--; // Quantas vezes o código passa por aqui? (Use o debug passo a passo)
        }
        // Qual o valor da variável x e da variável y neste ponto? (Use o debug passo a passo)

        System.out.printf("\n------ \n");
    }
}
