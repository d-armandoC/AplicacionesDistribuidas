/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase8.Serialización;
import java.io.*;

public class DeserializarObjeto {
    public static void main(String[] args) {
        try {
            ObjectInputStream entrada = new ObjectInputStream(
                    new FileInputStream("persona.dat"));

            Persona p = (Persona) entrada.readObject();
            entrada.close();

            System.out.println("Objeto recuperado: " + p);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}