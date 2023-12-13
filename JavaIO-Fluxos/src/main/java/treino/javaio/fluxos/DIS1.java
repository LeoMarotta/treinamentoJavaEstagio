/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.javaio.fluxos;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author leomarotta
 */
public class DIS1 {
    public void readt(){
        DataInputStream dis = null;
        try {
            File arquivo = new File("/home/leomarotta/Documentos/quack.txt");
            dis = new DataInputStream(new FileInputStream(arquivo));
            String msg = dis.readUTF();
            double val1 = dis.readDouble();
            int val2 = dis.readInt();
            dis.close();
            System.out.printf("Mensagem [%s] val1[%f] val2[%d] \n", msg, val1, val2);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
