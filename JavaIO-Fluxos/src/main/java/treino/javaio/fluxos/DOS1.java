/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.javaio.fluxos;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author leomarotta
 */
public class DOS1 {
    public void writet(){
        DataOutputStream dos = null;
        try {
            File arquivo = new File("/home/leomarotta/Documentos/quack.txt");
            dos = new DataOutputStream(new FileOutputStream(arquivo));
            dos.writeUTF("Teste de gravação");
            dos.writeDouble(12375.564);
            dos.writeInt(76849224);
            dos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
