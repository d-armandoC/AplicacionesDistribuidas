/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aplicaciones_distribuidas.controller.paxos;
class NodoPaxos {

    private String nombre;

    public NodoPaxos(String nombre) {
        this.nombre = nombre;
    }

    public boolean aceptarPropuesta(int valor) {
        System.out.println(nombre + " acepta valor: " + valor);
        return true;
    }
}

