/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase8.Serialización;
import java.io.*;

public class SerializarObjeto {
    public static void main(String[] args) {
        try {
            Persona p = new Persona("Ana", 25);

            ObjectOutputStream salida = new ObjectOutputStream(
                    new FileOutputStream("persona.dat"));

            salida.writeObject(p);
            salida.close();

            System.out.println("Objeto serializado");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}