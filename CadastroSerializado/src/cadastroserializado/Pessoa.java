/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroserializado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author leomarotta
 */
public class Pessoa implements Serializable {
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
    
    public void serializar(Pessoa pessoa){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/leomarotta/Documentos/quack.txt"));
            oos.writeObject("Gravando objeto\n");
            oos.writeObject(pessoa);
            oos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deserializar(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/leomarotta/Documentos/quack.txt"));
            String s = (String) ois.readObject();
            Pessoa p1 = (Pessoa) ois.readObject();
            System.out.println("Nome da Pessoa: " + p1.getNome());
            System.out.println("Endereço da Pessoa: " + p1.getEndereco());
            ois.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    }
    
}