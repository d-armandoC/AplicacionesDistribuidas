/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aplicaciones_distribuidas.controller.TwoPhase;


class Nodo {

    private String nombre;

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    // Fase 1: Preparar
    public boolean preparar() {
        System.out.println(nombre + " listo para confirmar");
        return true; // simula OK
    }

    // Fase 2: Confirmar
    public void confirmar() {
        System.out.println(nombre + " confirma la transacción");
    }

    public void cancelar() {
        System.out.println(nombre + " cancela la transacción");
    }
}

