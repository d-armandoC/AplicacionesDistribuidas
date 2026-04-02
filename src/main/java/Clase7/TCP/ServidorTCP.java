/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase7.TCP;

import java.io.*;
import java.net.*;

public class ServidorTCP {
    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(5000);
            System.out.println("Servidor TCP esperando conexion...");

            Socket cliente = servidor.accept();

            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(cliente.getInputStream()));
            String mensaje = entrada.readLine();

            System.out.println("Mensaje recibido: " + mensaje);

            cliente.close();
            servidor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
