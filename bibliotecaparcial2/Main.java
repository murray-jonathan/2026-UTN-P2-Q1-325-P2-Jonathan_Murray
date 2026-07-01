/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecaparcial2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Joni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        Scanner escaner = new Scanner(System.in);
        int opcion;
        boolean flag = true;
        
        do{
            System.out.println("1. Registrar nuevos socios de la biblioteca.\n" +
                                "2. Registrar nuevos libros.\n" +
                                "3. Listar socios registrados.\n" +
                                "4. Listar libros disponibles.\n" +
                                "5. Buscar libros utilizando algún criterio definido por el grupo.\n" +
                                "6. Registrar préstamos de libros.\n" +
                                "7. Registrar devoluciones.\n" +
                                "8. Mostrar préstamos activos.\n" +
                                "9. Generar un informe institucional en un archivo de texto.\n" +
                                "10. Guardar la información y finalizar el programa.\n" +
                                "0. Salir");
            
            System.out.println("opcion: ");
            opcion = escaner.nextInt();
            escaner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = escaner.nextLine();
                    System.out.println("apellido: ");
                    String apellido = escaner.nextLine();
                    System.out.println("dni: ");
                    int dni = escaner.nextInt();
                    
                    Socio socio = new Socio(dni, nombre, apellido);
                    b1.registrarSocio(socio);
                    
                    break;
                case 2:
                    System.out.println("Nombre: ");
                    String nombreLibro = escaner.nextLine();
                    System.out.println("Autor: ");
                    String autor = escaner.nextLine();
                    System.out.println("numero libro: ");
                    int idLibro = escaner.nextInt();
                    break;
                case 3:
                    b1.listarsocios();
                    break;
                case 4:
                    b1.listarLibros();
                    break;
                case 5:
                    System.out.println("Ingrese el numero del libro: ");
                    int codigoLibro = escaner.nextInt();
                    b1.buscarLibros(codigoLibro);
                    break;
                case 6:
                    System.out.println("Ingrese numero de prestamo: ");
                    int codigoPrestamo = escaner.nextInt();
                    System.out.println("Ingrese el codigo del libro que desea reservar: ");
                    int codigoLibroPrestamo = escaner.nextInt();
                    Libro libroPrestamo = b1.buscarLibros(codigoLibroPrestamo);
                    if(libroPrestamo != null){
                        System.out.println("Prestamo realizado");
                        LocalDate fechaPrestamo = LocalDate.of(2026, 06, 30);
                        LocalDate fechaDevolucion = LocalDate.of(2027, 06, 30);
                        
                        Prestamo prestamo = new Prestamo(codigoPrestamo, fechaPrestamo, fechaDevolucion, libroPrestamo);
                        b1.registrarPrestamo(prestamo);
                    }else{
                        System.out.println("No se encontro el libro");
                        break;
                    }
                    
                    
                    break;
                case 7:
                    System.out.println("Ingrese el codigo del libro a devolver: ");
                    int codigoLibroDevolver = escaner.nextInt();
                    b1.registarDevolucion(codigoLibroDevolver);
                    
                    break;
                case 8:
                    b1.listarPrestamo();
                    break;
                case 9:
                    b1.exportarInforme();
                    System.out.println("informe exportado");
                    break;
                case 10:
                    b1.guardarDatos();
                    b1.cargarDatos();
                    break;
                case 0:
                    System.out.println("saliendo");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            
        }while(flag);
            
            
        }
    }
    

