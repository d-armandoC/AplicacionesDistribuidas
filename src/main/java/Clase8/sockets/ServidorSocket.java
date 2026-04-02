/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase8.sockets;
import java.io.*;
import java.net.*;

public class ServidorSocket {
    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(7000);
            System.out.println("Servidor esperando conexion...");

            Socket cliente = servidor.accept();

            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(cliente.getInputStream()));

            String mensaje = entrada.readLine();
            System.out.println("Mensaje recibido: " + mensaje);

            cliente.close();
            servidor.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}