/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase5;

public class PerformanceTest {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            Math.sqrt(i);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin - inicio) + " ms");
    }
}