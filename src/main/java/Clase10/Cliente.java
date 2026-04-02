/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase10;

import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 5000);

        PrintWriter salida = new PrintWriter(
                socket.getOutputStream(), true
        );

        salida.println("Hola servidor");

        socket.close();
    }
}
