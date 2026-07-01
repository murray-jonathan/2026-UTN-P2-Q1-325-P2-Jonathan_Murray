/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joni
 */
import java.io.Serializable;
import java.time.LocalDate;

public class Libro implements Identificable, Serializable{
    private int codigo;
    private String autor;
    private LocalDate fechaPublicacion;
    
    public Libro(int codigo, String autor, LocalDate fechaPublicacion) {
        this.codigo = codigo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion
                + ", getCodigo()=" + getCodigo() + ", getAutor()=" + getAutor() + ", getFechaPublicacion()="
                + getFechaPublicacion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    
}
