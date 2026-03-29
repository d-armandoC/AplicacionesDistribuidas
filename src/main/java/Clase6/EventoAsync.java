/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventoAsync {

    private static ExecutorService executor = Executors.newSingleThreadExecutor();

    // Publicador
    public static void publicarEvento(String evento) {
        System.out.println("Evento publicado: " + evento);

        // Se ejecuta en otro hilo (asincrónico)
        executor.submit(() -> suscribirseEvento(evento));
    }

    // Suscriptor
    public static void suscribirseEvento(String evento) {
        try {
            Thread.sleep(1000); // simula procesamiento
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Evento recibido: " + evento);
    }

    public static void main(String[] args) {

        publicarEvento("Usuario creado");
        publicarEvento("Pago realizado");

        System.out.println("El sistema sigue ejecutándose...");
    }
}
