
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joni
 */
public class Socio extends Persona implements Identificable, Serializable{
    private int dni;
    private int id;

    public Socio(String nombre, String apellido, int dni, int id) {
        super(nombre, apellido);
        this.dni = dni;
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public int getCodigo() {
        return id;
    }

    @Override
    public String toString() {
        return "Socio [dni=" + dni + ", id=" + id + ", getDni()=" + getDni() + ", getCodigo()=" + getCodigo()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

}
