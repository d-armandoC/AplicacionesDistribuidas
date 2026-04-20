/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase14.mongoBD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService service;

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return service.guardar(producto);
    }

    @GetMapping
    public List<Producto> listar() {
        return service.listar();
    }
}