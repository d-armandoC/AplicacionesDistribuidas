/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aplicaciones_distribuidas.controller;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PubSubExample {

    public static void main(String[] args) {
        BlockingQueue<String> cola = new LinkedBlockingQueue<>();

        // Publicador
        new Thread(() -> {
            try {
                Thread.sleep(1000); // simula tiempo
                cola.put("Evento generado");
                System.out.println("Evento enviado");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Suscriptor
        new Thread(() -> {
            try {
                String mensaje = cola.take();
                System.out.println("Mensaje recibido: " + mensaje);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}