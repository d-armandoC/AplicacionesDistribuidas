/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SistemaEventos {

    private static ExecutorService executor = Executors.newFixedThreadPool(2);

    // Publicador
    public static void publicarEvento(EventoUsuario evento) {
        System.out.println("Evento publicado para: " + evento);

        executor.submit(() -> evento.procesarEvento());
    }

    public static void main(String[] args) {

        EventoUsuario e1 = new EventoUsuario("Diego");
        EventoUsuario e2 = new EventoUsuario("Armando");

        publicarEvento(e1);
        publicarEvento(e2);

        System.out.println("Sistema continua sin esperar...");
    }
}
