/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClient {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Método HTTP
            connection.setRequestMethod("GET");

            // Timeouts (importante en sistemas distribuidos)
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            // Headers
            connection.setRequestProperty("Accept", "application/json");

            int status = connection.getResponseCode();

            BufferedReader reader;

            // Manejo de respuesta según código HTTP
            if (status >= 200 && status < 300) {
                reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream())
                );
            } else {
                reader = new BufferedReader(
                        new InputStreamReader(connection.getErrorStream())
                );
            }

            // Leer toda la respuesta
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            System.out.println("Respuesta completa:");
            System.out.println(response.toString());

            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}