package Clase14;
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
    public List<Clase14.mongoBD.Producto> listar() {
        return service.listar();
    }
}
