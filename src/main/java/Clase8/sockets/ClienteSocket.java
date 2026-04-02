/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase8.sockets;

import java.io.*;
import java.net.*;

public class ClienteSocket {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 7000);

            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            salida.println("Hola desde el cliente (Clase 08)");

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}