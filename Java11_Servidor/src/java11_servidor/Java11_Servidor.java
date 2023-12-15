/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java11_servidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author leomarotta
 */
public class Java11_Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TCP
        
        /*try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String msgCliente = in.readUTF();
            System.out.println("Nome do Cliente: " + msgCliente);
            System.out.println("IP do Cliente: " + socket.getInetAddress().getHostAddress());
            System.out.println("Porta do Cliente: " + socket.getPort());

            String msgServidor = "Olá cliente " + msgCliente;
            out.writeUTF(msgServidor);

            in.close();
            out.close();
            socket.close();
        } catch (IOException ex) {
            System.out.println("Não foi possível montar a conexão no servidor.");
            ex.printStackTrace();
        }*/
        
        //UDP
        
        try {
            DatagramSocket dtSocket = new DatagramSocket(8889);

            DatagramPacket pacote = new DatagramPacket(new byte[512], 512);
            dtSocket.receive(pacote);

            String msgCliente = new String(pacote.getData());
            System.out.println("Nome do Cliente: " + msgCliente);
            System.out.println("IP do Cliente: " + pacote.getAddress().getHostAddress());
            System.out.println("Porta do Cliente: " + pacote.getPort());

            byte[] buffer = ("Olá cliente " + msgCliente).getBytes();
            pacote = new DatagramPacket(buffer, buffer.length, pacote.getAddress(), pacote.getPort());
            dtSocket.send(pacote);

            dtSocket.close();
        } catch (IOException ex) {
            System.out.println("Não foi possível montar a conexão no servidor.");
            ex.printStackTrace();
        }
    } 
}
