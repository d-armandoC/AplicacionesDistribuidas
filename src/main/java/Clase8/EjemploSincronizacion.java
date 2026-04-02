/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase8;

class Contador {
    private int valor = 0;

    public synchronized void incrementar() {
        valor++;
    }

    public int getValor() {
        return valor;
    }
}

public class EjemploSincronizacion {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) contador.incrementar();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) contador.incrementar();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Valor final: " + contador.getValor());
    }
}
