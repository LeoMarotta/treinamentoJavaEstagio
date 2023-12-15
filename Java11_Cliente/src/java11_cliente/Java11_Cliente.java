/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java11_cliente;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author leomarotta
 */

public class Java11_Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TCP
        /*try {
            Socket clientSocket = new Socket("localhost", 8888);

            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            out.writeUTF("Cliente 1");

            String msgServidor = in.readUTF();

            System.out.println("Mensagem do Servidor: " + msgServidor);
            System.out.println("IP do Servidor: " + clientSocket.getInetAddress().getHostAddress());
            System.out.println("Porta do Servidor: " + clientSocket.getPort());
            System.out.println("IP do Cliente: " + clientSocket.getLocalAddress().getHostAddress());
            System.out.println("Porta do Cliente: " + clientSocket.getLocalPort());

        } catch (IOException ex) {
            System.out.println("Não foi possível montar a conexão no cliente.");
            ex.printStackTrace();
        }*/
        
        //UDP
        
        try {
            DatagramSocket dtSocket = new DatagramSocket();
            InetAddress addr = InetAddress.getByName("127.0.0.1");
            byte[] buffer = "Cliente 1".getBytes();
            DatagramPacket pacote = new DatagramPacket(buffer, buffer.length, addr, 8889);

            System.out.println("IP do Cliente: " + pacote.getAddress().getHostAddress());
            System.out.println("Porta do Cliente: " + dtSocket.getLocalPort());

            dtSocket.send(pacote);

            pacote = new DatagramPacket(new byte[512], 512);
            dtSocket.receive(pacote);

            String msgServidor = new String(pacote.getData());
            System.out.println("Mensagem do Servidor: " + msgServidor);
            System.out.println("IP do Servidor: " + pacote.getAddress().getHostAddress());
            System.out.println("Porta do Servidor: " + pacote.getPort());

            dtSocket.close();
        } catch (IOException ex) {
            System.out.println("Não foi possível montar a conexão no cliente.");
            ex.printStackTrace();
        }  
    }
}