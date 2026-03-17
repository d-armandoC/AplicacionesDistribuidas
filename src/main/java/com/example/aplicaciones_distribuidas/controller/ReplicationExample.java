/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aplicaciones_distribuidas.controller;
import java.util.HashMap;
import java.util.Map;

public class ReplicationExample {

    // Simulación de dos servidores (réplicas)
    static Map<Integer, String> servidorA = new HashMap<>();
    static Map<Integer, String> servidorB = new HashMap<>();

    // Método para guardar datos (se replica en ambos)
    public static void guardarUsuario(int id, String nombre) {
        servidorA.put(id, nombre);
        servidorB.put(id, nombre);
        System.out.println("Usuario guardado en ambos servidores");
    }

    // Lectura desde servidor A
    public static String leerDesdeA(int id) {
        return servidorA.get(id);
    }

    // Lectura desde servidor B
    public static String leerDesdeB(int id) {
        return servidorB.get(id);
    }

    public static void main(String[] args) {

        guardarUsuario(1, "Juan");
        guardarUsuario(2, "Maria");

        System.out.println("Servidor A: " + leerDesdeA(1));
        System.out.println("Servidor B: " + leerDesdeB(1));
    }
}
