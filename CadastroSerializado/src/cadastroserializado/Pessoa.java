/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroserializado;

import java.util.List;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author leomarotta
 */
public class Pessoa implements Serializable {
    private static final String FILE_PATH = "/home/leomarotta/Documentos/BDfake.txt";
    private String nome;
    private String endereco;
        
    public Pessoa(){
        System.out.println("Executou Construtor");
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static void serializar(List<Pessoa> pessoas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            for (Pessoa pessoa : pessoas) {
                oos.writeObject(pessoa);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static List<Pessoa> deserializar() {
        List<Pessoa> pessoas = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            while (true) {
                Pessoa pessoa = (Pessoa) ois.readObject();
                pessoas.add(pessoa);
            }
        } catch (EOFException eofException) {
            // Fim do arquivo alcançado
        } catch (ClassNotFoundException | IOException ex) {
            ex.printStackTrace();
        }

        return pessoas;
    }
    
}