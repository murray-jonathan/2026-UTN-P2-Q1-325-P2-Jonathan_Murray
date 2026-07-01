
import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joni
 */
public class ExportadorTxt {
    public static void exportarLibros(Caja<Libro> libros, String nombreArchivo) {
        
        if (libros.getElementos().isEmpty()) {
        System.out.println("No hay libros para exportar.");
        return;
    }

    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {

        escritor.write("===== REPORTE DE LIBROS =====");
        escritor.newLine();
        escritor.newLine();

        for (Libro libro : libros.getElementos()) {

            escritor.write("Código: " + libro.getCodigo());
            escritor.newLine();

            escritor.write("Autor: " + libro.getAutor());
            escritor.newLine();

            escritor.write("Fecha: " + libro.getFechaPublicacion());
            escritor.newLine();

            escritor.write("----------------------------------------");
            escritor.newLine();
        }

        System.out.println("Reporte exportado correctamente.");

    } catch (Exception e) {
        System.out.println("Error al exportar el reporte: " + e.getMessage());
    }

    }
}
