/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase5;

// Interfaz
interface Servicio {
    void ejecutar();
}

// Implementaciones
class ServicioA implements Servicio {
    public void ejecutar() {
        System.out.println("Servicio A ejecutado");
    }
}

class ServicioB implements Servicio {
    public void ejecutar() {
        System.out.println("Servicio B ejecutado");
    }
}

// Clase principal
public class InterfazExample {

    public static void main(String[] args) {

        Servicio servicio1 = new ServicioA();
        Servicio servicio2 = new ServicioB();

        servicio1.ejecutar();
        servicio2.ejecutar();
    }
}