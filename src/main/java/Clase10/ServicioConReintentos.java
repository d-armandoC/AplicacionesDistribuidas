/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase10;

import java.util.Random;

public class ServicioConReintentos {

    public void llamarServicioConReintentos() {
        int maxIntentos = 5;
        long tiempoBaseEsperaMs = 1000; // 1 segundo
        Random random = new Random();

        for (int intento = 1; intento <= maxIntentos; intento++) {
            try {
                System.out.println("Intento " + intento + ": Llamando al servicio...");
                // Simula una llamada a un servicio que puede fallar
                boolean exito = simularLlamadaServicio();

                if (exito) {
                    System.out.println("Servicio llamado con éxito en el intento " + intento);
                    return; // Sale del bucle si tiene éxito
                } else {
                    System.out.println("Intento " + intento + ": Fallo la llamada al servicio.");
                }
            } catch (Exception e) {
                System.err.println("Intento " + intento + ": Error inesperado: " + e.getMessage());
            }

            if (intento < maxIntentos) {
                // Calcula el tiempo de espera con exponencial backoff y jitter
                long tiempoEspera = tiempoBaseEsperaMs * (1L << (intento - 1)); // 1, 2, 4, 8, 16 segundos
                long jitter = random.nextInt((int) (tiempoEspera / 2)); // Añade un jitter aleatorio
                tiempoEspera += jitter;

                System.out.println("Esperando " + (tiempoEspera / 1000.0) + " segundos antes del proximo intento.");
                try {
                    Thread.sleep(tiempoEspera);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    System.err.println("Reintento interrumpido.");
                    return;
                }
            }
        }
        System.out.println("Fallo la llamada al servicio después de " + maxIntentos + " intentos.");
    }

    // Simula una llamada a un servicio que falla el 80% de las veces
    private boolean simularLlamadaServicio() {
        return Math.random() > 0.8; // 20% de éxito
    }

    public static void main(String[] args) {
        new ServicioConReintentos().llamarServicioConReintentos();
    }
}
