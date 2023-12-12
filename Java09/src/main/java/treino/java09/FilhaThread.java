/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.java09;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leomarotta
 */
public class FilhaThread extends Thread {
    private int count = 50;
    
    public FilhaThread(String nome){
    super(nome);        
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(this.getId() + " " + this.getName());
                Thread.sleep(1000);
                if (--count == 0) { 
                    return;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(FilhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
