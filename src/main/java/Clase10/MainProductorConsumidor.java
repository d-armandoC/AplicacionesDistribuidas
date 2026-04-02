/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase10;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainProductorConsumidor {
    public static void main(String[] args) {
        BlockingQueue<String> cola = new ArrayBlockingQueue<>(10); // Cola con capacidad limitada

        Productor productor = new Productor(cola);
        Consumidor consumidor = new Consumidor(cola);

        new Thread(productor).start();
        new Thread(consumidor).start();

        System.out.println("Iniciados productor y consumidor. Presiona Ctrl+C para detener.");
    }
}