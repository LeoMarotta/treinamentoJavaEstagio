/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.javaio.fluxos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author leomarotta
 */
public class FW1 {
    public void writef(){
        try {
            File arquivo = new File("/home/leomarotta/Documentos/quackDeArquivo.txt");
            FileWriter fw = new FileWriter(arquivo);
            fw.write("Teste de gravação");
            fw.close();
            System.out.println("ESCRITA EM quackDeArquivo Completa");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();  
        }
    }
}