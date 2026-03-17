/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase5;
import java.util.Base64;

public class EncryptionExample {

    public static void main(String[] args) {

        String texto = "mensaje secreto";

        String cifrado = Base64.getEncoder().encodeToString(texto.getBytes());
        System.out.println("Cifrado: " + cifrado);

        String descifrado = new String(Base64.getDecoder().decode(cifrado));
        System.out.println("Descifrado: " + descifrado);
    }
}