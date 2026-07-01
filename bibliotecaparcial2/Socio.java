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
public class Socio extends Persona implements Identificable, Serializable{
    private int dni;

    public Socio(int dni, String nombre, String apellido) {
        super(nombre, apellido);
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }
    
    
    
    @Override
    public int getCodigo(){
        return dni;
    }

    @Override
    public String toString() {
        return "Socio{" + "dni=" + dni + '}';
    }
    
    
    
    
}
