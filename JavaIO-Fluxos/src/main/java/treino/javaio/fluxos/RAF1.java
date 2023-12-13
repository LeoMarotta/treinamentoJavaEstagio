/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.javaio.fluxos;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author leomarotta
 */
public class RAF1 {
    public void aleatoriof(){
        try {
            RandomAccessFile raf = new RandomAccessFile("/home/leomarotta/Documentos/quackDeArquivo.txt", "rw");
            raf.writeChars("Olá Pessoal\n");
            raf.seek(0);
            String linha=null;
            while((linha=raf.readLine())!=null){
                System.out.println("Arquivo: " + linha);
            }
            System.out.println(" ---- ");
            raf.seek(0);
            raf.writeChars("Gravei no inicio\n");
            raf.seek(0);
            while((linha=raf.readLine())!=null){
                System.out.println("Arquivo: " + linha);
            }
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
