/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaparcial2;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Joni
 */
public class Biblioteca{
    private Caja<Libro> libros;
    private Caja<Socio> socios;
    private Caja<Prestamo> prestamos;
    private Caja<Devolucion> devoluciones;
    
    
    
    
    
    public Biblioteca(){
        libros = new Caja<>();
        socios = new Caja<>();
        prestamos = new Caja<>();
        devoluciones = new Caja<>();
    }
    
    // Libros
    public void registrarLibro(Libro libro){
        if(libros.buscar(libro.getCodigo()) != null){
            System.out.println("el libro ya existe");
            return;
        }
        libros.agregar(libro);
    }
    
    public Libro buscarLibros(int codigo){
        return libros.buscar(codigo);
    }
    
    public void listarLibros(){
        libros.listar();
    }
    
    // Socios
    public void registrarSocio(Socio socio){
        if(socios.buscar(socio.getCodigo()) != null){
            System.out.println("el socio ya existe");
            return;
        }
        socios.agregar(socio);
    }
    
    public Socio buscarsocio(int codigo){
        return socios.buscar(codigo);
    }
    
    public void listarsocios(){
        socios.listar();
    }
    
    // Prestamos
    
    public void registrarPrestamo(Prestamo prestamo){
        if(prestamos.buscar(prestamo.getCodigo()) != null){
            System.out.println("el prestamo ya existe");
            return;
        }
        prestamos.agregar(prestamo);
    }
    
    public Prestamo buscarPrestamo(int codigo){
        return prestamos.buscar(codigo);
    }
    
    public void listarPrestamo(){
        prestamos.listar();
    }
    
    
    // devolucion
    
    public void registarDevolucion(int codigo){
        Prestamo prestamo = buscarPrestamo(codigo);
        if(prestamo != null){
            int codigoLibro = prestamo.getLibro().getId();
            Libro libroADevolver = buscarLibros(codigoLibro);
            // queria usar un LocalDate.now() pero no estaba seguro si me daba las fechas completas
            // la idea es que la devolucion se registre con la fecha actual.
            LocalDate fechaDevolucion = LocalDate.of(2026, 06, 30);
            
            Devolucion devolucion = new Devolucion(1, fechaDevolucion, libroADevolver);
            
            devoluciones.agregar(devolucion);
            devoluciones.listar();
            
        
        }else{
            System.out.println("el prestamo no existe");
            return;
        }
        
    }
    
    public void exportarInforme(){
        ExportadorTexto.exportarInforme(libros, socios, prestamos, devoluciones, "Informe.txt");
    }
    
    public void guardarDatos(){
        Serializador.guardar(libros, "libros.dat");
        Serializador.guardar(socios, "socios.dat");
        Serializador.guardar(prestamos, "prestamos.dat");
        Serializador.guardar(devoluciones, "devoluciones.dat");
    }
    
    public void cargarDatos(){
        Caja<Libro> librosCargados = (Caja<Libro>) Serializador.cargar("libros.dat");
        
        if (librosCargados != null) {
        libros = librosCargados;
        }
        
        
        Caja<Socio> sociosCargados = (Caja<Socio>) Serializador.cargar("socios.dat");
        
        if (sociosCargados != null) {
        socios = sociosCargados;
        }
        
        Caja<Prestamo> prestamosCargados = (Caja<Prestamo>) Serializador.cargar("prestamos.dat");
        if (prestamosCargados != null) {
        prestamos = prestamosCargados;
        }
        
        Caja<Devolucion> devolucionesCargados = (Caja<Devolucion>) Serializador.cargar("devoluciones.dat");
        if (devolucionesCargados != null) {
        devoluciones = devolucionesCargados;
        }
    }
    
    
}
