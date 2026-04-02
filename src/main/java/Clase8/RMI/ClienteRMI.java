/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase8.RMI;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            Registry registro = LocateRegistry.getRegistry("localhost", 1099);

            Calculadora stub = (Calculadora) registro.lookup("Calculadora");

            int resultado = stub.sumar(5, 3);
            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
