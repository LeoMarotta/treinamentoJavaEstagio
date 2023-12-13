/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.javaio.fluxos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author leomarotta
 */
public class FR1 {
    public void readf(){
        try {
            File arquivo = new File("/home/leomarotta/Documentos/quackDeArquivo.txt");
            FileReader fr = new FileReader(arquivo);
            int leitura = -1;
            do {
                leitura = fr.read();
                if (leitura != -1) {
                    System.out.println(leitura + " " + (char) leitura);
                }
            } while (leitura != -1);
            fr.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
