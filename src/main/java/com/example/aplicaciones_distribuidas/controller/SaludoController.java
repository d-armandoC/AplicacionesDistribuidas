/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aplicaciones_distribuidas.controller;
import Clase9.Swagger.Usuario;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author 59399
 */
@RestController
@RequestMapping("/api")
public class SaludoController {

    @GetMapping("/saludo")
    public Map<String, String> saludo() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Hola desde el servidor");
        return response;
    }
     @GetMapping("/usuarios")
    public Usuario obtenerUsuario() {
        Usuario u = new Usuario();
        u.setNombre("Diego");
        u.setEdad(33);
        return u;
    }

    @PostMapping
    public String crearUsuario(@RequestBody Usuario usuario) {
        return "Usuario creado: " + usuario.getNombre();
    }
}
