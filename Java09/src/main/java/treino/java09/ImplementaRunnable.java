/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.java09;

/**
 *
 * @author leomarotta
 */
public class ImplementaRunnable implements Runnable{
    private int count = 50;
    
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName());
            if(--count == 0){
                return;
            }
        }
    }
}
