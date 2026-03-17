/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aplicaciones_distribuidas.controller.TwoPhase;
public class TwoPhaseCommitExample {

    public static void main(String[] args) {

        Nodo nodo1 = new Nodo("Nodo A");
        Nodo nodo2 = new Nodo("Nodo B");

        // FASE 1: PREPARE
        boolean ok1 = nodo1.preparar();
        boolean ok2 = nodo2.preparar();

        // FASE 2: COMMIT o ROLLBACK
        if (ok1 && ok2) {
            nodo1.confirmar();
            nodo2.confirmar();
            System.out.println("TRANSACCIÓN COMPLETADA");
        } else {
            nodo1.cancelar();
            nodo2.cancelar();
            System.out.println("TRANSACCIÓN CANCELADA");
        }
    }
}

