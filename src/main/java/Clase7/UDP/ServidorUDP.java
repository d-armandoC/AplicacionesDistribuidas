/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase7.UDP;
import java.net.*;

public class ServidorUDP {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(6000);
            byte[] buffer = new byte[1024];

            DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);
            socket.receive(paquete);

            String mensaje = new String(paquete.getData(), 0, paquete.getLength());
            System.out.println("Mensaje recibido: " + mensaje);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}