/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase10;

import java.util.concurrent.BlockingQueue;

public class Consumidor implements Runnable {
    private final BlockingQueue<String> cola;

    public Consumidor(BlockingQueue<String> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String mensaje = cola.take(); // Toma el mensaje de la cola
                System.out.println("Consumidor: Procesado - " + mensaje);
                Thread.sleep(2000); // Simula trabajo de procesamiento
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumidor interrumpido.");
        }
    }
}
