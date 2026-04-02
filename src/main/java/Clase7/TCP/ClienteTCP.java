/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase7.TCP;

import java.io.*;
import java.net.*;

public class ClienteTCP {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            salida.println("Hola desde el cliente TCP");

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}