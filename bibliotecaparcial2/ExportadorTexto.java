/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaparcial2;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Joni
 */
public class ExportadorTexto {
    
    public static void exportarInforme(Caja<Libro> libros, Caja<Socio> socios, Caja<Prestamo> prestamos, Caja<Devolucion> devoluciones, 
            String nombreArchivo){
        if (libros.getElementos().isEmpty()) {
        System.out.println("No hay libros para exportar.");
        return;
        
        }
        
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))){
            escritor.write(" Reporte Institucional");
            escritor.newLine();
            escritor.write("Libros disponibles");
            escritor.newLine();
            
            
            for(Libro libro : libros.getElementos()){
                escritor.write("Nombre: " + libro.getNombre());
                escritor.newLine();
                escritor.write("Autor: " + libro.getAutor());
                escritor.newLine();
                escritor.write("Id: " + libro.getId());
            }
            
            escritor.newLine();      
            escritor.write("Socios disponibles");
            escritor.newLine();
            
            for(Socio socio : socios.getElementos()){
                escritor.write("Dni: " + socio.getDni());
                escritor.newLine();
                escritor.write("Nombre: " + socio.getNombre());
                escritor.newLine();
                escritor.write("Apellido: " + socio.getApellido());
            }
            
            escritor.newLine();      
            escritor.write("Prestamos disponibles");
            escritor.newLine();
            
            for(Prestamo prestamo : prestamos.getElementos()){
                escritor.write("Id: " + prestamo.getCodigo());
                escritor.newLine();
                escritor.write("Fecha De adquisicion: " + prestamo.getFechaEmpezado());
                escritor.newLine();
                escritor.write("Fecha De caducidad " + prestamo.getFechaTerminado());
                
            }
            
            escritor.newLine();      
            escritor.write("Devoluciones disponibles");
            escritor.newLine();
            
            for(Devolucion devolucion : devoluciones.getElementos()){
                escritor.write("Fecha devolucion: " + devolucion.getFechaDevolucion());
                escritor.newLine();
                escritor.write("Id " + devolucion.getCodigo());
                escritor.newLine();
                escritor.write("Libro: " + devolucion.getLibro());
                
            }
            
            System.out.println("Reporte exportado correctamente.");
  
        
        
        }catch (Exception e) {
            System.out.println("Error al exportar el reporte: " + e.getMessage());
    }
    }
    }
