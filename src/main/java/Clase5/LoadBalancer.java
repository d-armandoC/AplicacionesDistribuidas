/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase5;

public class LoadBalancer {

    public static String seleccionarServidor(int requestId) {
        String[] servidores = {"Servidor A", "Servidor B", "Servidor C"};
        return servidores[requestId % servidores.length];
    }

    public static void main(String[] args) {
        System.out.println(seleccionarServidor(5));
    }
}
