/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase10;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeController {

    @GetMapping("/saludar")
    public String saludar() {
        return "¡Hola desde el servicio RESTful de Spring Boot!";
    }

    @GetMapping("/saludar/{nombre}")
    public String saludarPersonalizado(@PathVariable String nombre) {
        return "¡Hola, " + nombre + "! Saludos desde Spring Boot.";
    }

    @GetMapping("/sumar/{a}/{b}")
    public String sumar(@PathVariable int a, @PathVariable int b) {
        int resultado = a + b;
        return "La suma de " + a + " y " + b + " es: " + resultado;
    }
}