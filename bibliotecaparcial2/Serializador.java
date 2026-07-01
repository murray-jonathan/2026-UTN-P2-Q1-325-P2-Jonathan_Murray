/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaparcial2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Joni
 */
public class Serializador {
     public static void guardar(Object objeto, String nombreArchivo){
        try{
            FileOutputStream archivo = new FileOutputStream(nombreArchivo);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            
            salida.writeObject(objeto);
            salida.close();
            archivo.close();
            
            System.out.println("Datos guardados correctamente.");
        
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public static Object cargar(String nombreArchivo) {
        try {
            FileInputStream archivo = new FileInputStream(nombreArchivo);
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            Object objeto = entrada.readObject();

            entrada.close();
            archivo.close();

            System.out.println("Datos cargados correctamente.");

            return objeto;

        } catch (Exception e) {
            System.out.println("Error al cargar el archivo: " + e.getMessage());
            return null;
        }
    
    }
}
