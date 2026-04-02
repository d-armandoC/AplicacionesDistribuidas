/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase8.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    int sumar(int a, int b) throws RemoteException;
}
