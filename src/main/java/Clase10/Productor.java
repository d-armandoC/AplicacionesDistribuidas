/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase10;
import java.util.concurrent.BlockingQueue;

public class Productor implements Runnable {
    private final BlockingQueue<String> cola;
    private int mensajeId = 0;

    public Productor(BlockingQueue<String> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String mensaje = "Mensaje " + mensajeId++;
                cola.put(mensaje); // Pone el mensaje en la cola
                System.out.println("Productor: Enviado - " + mensaje);
                Thread.sleep(1000); // Simula trabajo
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Productor interrumpido.");
        }
    }
}