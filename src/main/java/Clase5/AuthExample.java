/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase5;


public class AuthExample {

    public static boolean autenticar(String usuario, String clave) {
        return usuario.equals("admin") && clave.equals("1234");
    }

    public static void main(String[] args) {

        boolean acceso = autenticar("admin", "1234");

        if (acceso) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}