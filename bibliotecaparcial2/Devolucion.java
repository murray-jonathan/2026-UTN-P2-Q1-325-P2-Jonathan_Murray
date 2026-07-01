/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaparcial2;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Joni
 */
public class Devolucion implements Identificable, Serializable {
    private LocalDate fechaDevolucion;
    private int idDevolucion;
    private Libro libro;

    public Devolucion(int idDevolucion, LocalDate fechaDevolucion, Libro libro) {
        this.idDevolucion = idDevolucion;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    @Override
    public int getCodigo() {
        return idDevolucion;
    }
}
