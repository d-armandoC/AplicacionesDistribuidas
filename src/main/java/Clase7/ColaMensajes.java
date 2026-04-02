/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase7;

import java.util.LinkedList;
import java.util.Queue;

public class ColaMensajes {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Productor
        cola.add("Mensaje 1");
        cola.add("Mensaje 2");

        // Consumidor
        while (!cola.isEmpty()) {
            String mensaje = cola.poll();
            System.out.println("Procesando: " + mensaje);
        }
    }
}