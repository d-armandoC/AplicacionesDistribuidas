/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase12;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    // Endpoint básico
    @GetMapping("/saludo")
    public String saludo() {
        return "Hola desde Spring Boot";
    }

    // Endpoint con parámetro
    @GetMapping("/saludo/{nombre}")
    public String saludoPersonalizado(@PathVariable String nombre) {
        return "Hola " + nombre;
    }

    // Endpoint con operación
    @GetMapping("/sumar/{a}/{b}")
    public int sumar(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }
}
