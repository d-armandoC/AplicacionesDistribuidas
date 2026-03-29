/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase6;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Productor
class Productor implements Runnable {
    private BlockingQueue<String> cola;

    public Productor(BlockingQueue<String> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                String mensaje = "Mensaje " + i;
                cola.put(mensaje);
                System.out.println("Enviado: " + mensaje);
                Thread.sleep(500); // simula tiempo de envío
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Consumidor
class Consumidor implements Runnable {
    private BlockingQueue<String> cola;

    public Consumidor(BlockingQueue<String> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String mensaje = cola.take();
                System.out.println("Procesado: " + mensaje);
                Thread.sleep(1000); // simula procesamiento lento
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Clase principal
public class AsincronoEjemplo {

    public static void main(String[] args) {

        BlockingQueue<String> cola = new LinkedBlockingQueue<>();

        Thread productor = new Thread(new Productor(cola));
        Thread consumidor = new Thread(new Consumidor(cola));

        productor.start();
        consumidor.start();
    }
}
