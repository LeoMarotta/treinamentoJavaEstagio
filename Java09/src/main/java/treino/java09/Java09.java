/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package treino.java09;

/**
 *
 * @author leomarotta
 */
public class Java09 {

    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        
        /*ImplementaRunnable i1=new ImplementaRunnable();
        ImplementaRunnable i2=new ImplementaRunnable();
        ImplementaRunnable i3=new ImplementaRunnable();
        ImplementaRunnable i4=new ImplementaRunnable();
        Thread t1 = new Thread(i1, "primeira");
        Thread t2 = new Thread(i2,"segunda");
        Thread t3 = new Thread(i3,"terceira");
        Thread t4 = new Thread(i4,"quarta");*/
        
        /*Thread t1=new FilhaThread("primeira");
        Thread t2=new FilhaThread("segunda");       
        Thread t3=new FilhaThread("terceira");
        Thread t4=new FilhaThread("quarta");*/
        
        /*t1.start();
        t2.start();
        t3.start();
        t4.start();*/
        
        
        Thread t1 = new Sleeper("T1");
        t1.start();
        try {
            System.out.println("Aguardando a thread terminar.");
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread principal interrompida.");
        }
        System.out.println("Fim da thread principal.");
    }
}
