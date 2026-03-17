/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aplicaciones_distribuidas.controller;

public class ShardingExample {

    public static String obtenerServidor(int userId) {
        if (userId % 2 == 0) {
            return "Servidor A";
        } else {
            return "Servidor B";
        }
    }

    public static void main(String[] args) {

        int[] usuarios = {10, 15, 22, 33, 40};

        for (int userId : usuarios) {
            System.out.println("Usuario " + userId +
                    " → " + obtenerServidor(userId));
        }
    }
}
