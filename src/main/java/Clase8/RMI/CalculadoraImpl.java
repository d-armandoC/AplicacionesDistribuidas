/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase8.RMI;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

    protected CalculadoraImpl() throws RemoteException {
        super();
    }

    public int sumar(int a, int b) throws RemoteException {
        return a + b;
    }
}
