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
public class Prestamo implements Identificable, Serializable{
    
    private int codigo;
    private LocalDate fechaEmpezado;
    private LocalDate fechaTerminado;
    private Libro libro;

    public Prestamo(int codigo, LocalDate fechaEmpezado, LocalDate fechaTerminado, Libro libro) {
        this.codigo = codigo;
        this.fechaEmpezado = fechaEmpezado;
        this.fechaTerminado = fechaTerminado;
        this.libro = libro;
    }

    public LocalDate getFechaEmpezado() {
        return fechaEmpezado;
    }

    public LocalDate getFechaTerminado() {
        return fechaTerminado;
    }

    public Libro getLibro() {
        return libro;
    }
    
    
    
    

    @Override
    public int getCodigo() {
        return codigo;
    }
    
}
