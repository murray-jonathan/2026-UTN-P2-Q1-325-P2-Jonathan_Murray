/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaparcial2;

import java.io.Serializable;

/**
 *
 * @author Joni
 */
public class Libro implements Identificable, Serializable {
    private String nombre;
    private String autor;
    private int id;

    public Libro(String nombre, String autor, int id) {
        this.nombre = nombre;
        this.autor = autor;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public int getCodigo(){
        return id;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", id=" + id + '}';
    }
    
    
}
