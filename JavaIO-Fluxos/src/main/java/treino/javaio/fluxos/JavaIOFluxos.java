/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package treino.javaio.fluxos;

/**
 *
 * @author leomarotta
 */
public class JavaIOFluxos {

    public static void main(String[] args) {
        
        FOS1 quack = new FOS1();
        FIS1 quacker = new FIS1();
        DOS1 quackerr = new DOS1();
        DIS1 quackerrr = new DIS1();
        FW1 quackerrrr = new FW1();
        FR1 quackerrrrr = new FR1();
        RAF1 quackerrrrrr = new RAF1();
        
        System.out.println("\n Resultado de FOS1:\n");
        quack.createf();
        System.out.println("\n Resultado de FiS1:\n");
        quacker.readquack();
        System.out.println("\n Resultado de DOS1:\n");
        quackerr.writet();
        System.out.println("\n Resultado de DIS1:\n");
        quackerrr.readt();
        System.out.println("\n Resultado de FWS1:\n");
        quackerrrr.writef();
        System.out.println("\n Resultado de FRS1:\n");
        quackerrrrr.readf();
        System.out.println("\n Resultado de RAF1:\n");
        quackerrrrrr.aleatoriof();
    }
}
