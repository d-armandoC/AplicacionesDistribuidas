/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aplicaciones_distribuidas.controller.paxos;
import java.util.ArrayList;
import java.util.List;

public class PaxosExample {

    public static void main(String[] args) {

        List<NodoPaxos> nodos = new ArrayList<>();
        nodos.add(new NodoPaxos("Nodo A"));
        nodos.add(new NodoPaxos("Nodo B"));
        nodos.add(new NodoPaxos("Nodo C"));

        int propuesta = 100;
        int votos = 0;

        for (NodoPaxos nodo : nodos) {
            if (nodo.aceptarPropuesta(propuesta)) {
                votos++;
            }
        }

        if (votos > nodos.size() / 2) {
            System.out.println("CONSENSO ALCANZADO: " + propuesta);
        } else {
            System.out.println("NO HAY CONSENSO");
        }
    }
}