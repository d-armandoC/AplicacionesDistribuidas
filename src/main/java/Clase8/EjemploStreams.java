/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase8;

import java.io.*;

public class EjemploStreams {
    public static void main(String[] args) {
        try {
            // Escribir en archivo
            FileWriter writer = new FileWriter("archivo.txt");
            writer.write("Hola, flujo de datos en Java");
            writer.close();

            // Leer archivo
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String linea = reader.readLine();
            System.out.println("Contenido: " + linea);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}