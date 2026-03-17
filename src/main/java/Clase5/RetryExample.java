/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase5;

public class RetryExample {

    public static void ejecutar() {
        int intentos = 0;
        while (intentos < 3) {
            try {
                System.out.println("Intento " + intentos);
                if (intentos < 2) throw new Exception("Fallo");
                System.out.println("Operación exitosa");
                break;
            } catch (Exception e) {
                intentos++;
            }
        }
    }

    public static void main(String[] args) {
        ejecutar();
    }
}