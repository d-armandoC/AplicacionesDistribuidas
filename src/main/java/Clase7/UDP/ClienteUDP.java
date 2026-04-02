/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase7.UDP;

import java.net.*;

public class ClienteUDP {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            String mensaje = "Hola desde cliente UDP";

            byte[] buffer = mensaje.getBytes();

            InetAddress direccion = InetAddress.getByName("localhost");
            DatagramPacket paquete = new DatagramPacket(buffer, buffer.length, direccion, 6000);

            socket.send(paquete);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}