
package Clase6;
public class EventoUsuario {
    private String nombre;

    
    public EventoUsuario(String nombre) {
        this.nombre = nombre;
    }

    public void procesarEvento() {
        System.out.println("Evento procesado para: " + nombre);
    }
}
