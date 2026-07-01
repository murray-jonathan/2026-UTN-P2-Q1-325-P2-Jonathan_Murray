
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joni
 */
public class Devolucion {
    LocalDate fechaDevolucion;
    private Libro libro;

    public Devolucion(LocalDate fechaDevolucion, Libro libro) {
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }
    
    
    
    
    
}
