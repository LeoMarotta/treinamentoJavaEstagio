/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.javaio.fluxos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author leomarotta
 */
public class FOS1 {
    public void createf(){
        FileOutputStream fos = null;
        try {
            File arquivo = new File("/home/leomarotta/Documentos/quack.txt");
            fos = new FileOutputStream(arquivo);
            byte [] dados="QUACK".getBytes();
            fos.write(dados);
            fos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
