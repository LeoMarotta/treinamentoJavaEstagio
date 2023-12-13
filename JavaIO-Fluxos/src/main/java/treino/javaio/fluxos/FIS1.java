/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.javaio.fluxos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author leomarotta
 */
public class FIS1 {
    public void readquack(){
        FileInputStream fis = null;
        try {
            File arquivo = new File("/home/leomarotta/Documentos/quack.txt");
            fis = new FileInputStream(arquivo);
            int leitura = -1;
            do {
            leitura = fis.read();
            if (leitura != -1) {
            System.out.println(leitura + " " + (char) leitura);
            }
            } while (leitura != -1);
            fis.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
