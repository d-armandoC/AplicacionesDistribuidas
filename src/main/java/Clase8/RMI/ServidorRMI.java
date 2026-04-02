/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase8.RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            CalculadoraImpl obj = new CalculadoraImpl();

            Registry registro = LocateRegistry.createRegistry(1099);
            registro.rebind("Calculadora", obj);

            System.out.println("Servidor RMI listo...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
