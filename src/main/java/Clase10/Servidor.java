/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase10;
import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Servidor esperando conexion...");

        Socket socket = server.accept();

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );

        String mensaje = entrada.readLine();
        System.out.println("Cliente dice: " + mensaje);

        socket.close();
        server.close();
    }
}
