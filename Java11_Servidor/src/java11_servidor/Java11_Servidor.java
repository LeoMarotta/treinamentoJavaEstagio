/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java11_servidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author leomarotta
 */
public class Java11_Servidor {

    private static final int PORT = 8889;
    private static final int THREAD_POOL_SIZE = 10;
    
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
        
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        try (DatagramSocket dtSocket = new DatagramSocket(PORT)) {
            while (true) {
                DatagramPacket pacote = new DatagramPacket(new byte[512], 512);
                dtSocket.receive(pacote);

                // Criar uma nova thread para lidar com o cliente
                executorService.submit(new ClienteHandler(dtSocket, pacote));
            }
        } catch (IOException ex) {
            System.out.println("Erro no servidor: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    } 
}
