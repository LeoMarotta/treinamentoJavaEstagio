/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.java09;

/**
 *
 * @author leomarotta
 */
public class Sleeper extends Thread {
    
    public Sleeper(String name) {
    super(name);
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
        System.out.println(getId()+" "+getName()+" despertou!");
    }
}