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
        FOS1 quack = new FOS1(); quack.createf();
        FIS1 quacker = new FIS1();
        DOS1 quackerr = new DOS1();
        DIS1 quackerrr = new DIS1();
        quack.createf();
        quacker.readquack();
        quackerr.writet();
        quackerrr.readt();
    }
}
