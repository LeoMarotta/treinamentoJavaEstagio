/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java11_servidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author leomarotta
 */
class ClienteHandler implements Runnable {

    private final DatagramSocket dtSocket;
    private final DatagramPacket pacote;

    public ClienteHandler(DatagramSocket dtSocket, DatagramPacket pacote) {
        this.dtSocket = dtSocket;
        this.pacote = pacote;
    }

    @Override
    public void run() {
        try {
            String msgCliente = new String(pacote.getData());
            System.out.println("Nome do Cliente: " + msgCliente);
            System.out.println("IP do Cliente: " + pacote.getAddress().getHostAddress());
            System.out.println("Porta do Cliente: " + pacote.getPort());

            byte[] buffer = ("Olá cliente " + msgCliente).getBytes();
            pacote.setData(buffer);
            dtSocket.send(pacote);

        } catch (IOException ex) {
            System.out.println("Erro ao lidar com o cliente: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}