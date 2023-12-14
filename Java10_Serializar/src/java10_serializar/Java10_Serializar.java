/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java10_serializar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author leomarotta
 */
public class Java10_Serializar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pessoa pessoa=new Pessoa();
        pessoa.setId(1201);
        pessoa.setNome("João");
        
        pessoa.serializar(pessoa);
        pessoa.deserializar();
    }
    
}
