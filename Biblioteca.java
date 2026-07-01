import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

public class Biblioteca{
    private Caja<Libro> libros;
    private Caja<Socio> socios;



    public Biblioteca(){
        libros = new Caja<>();
        socios = new Caja<>();
    }

    public void agregarLibro(Libro libro){
        if(libros.buscar(libro.getCodigo()) != null){
        System.out.println("El libro ya existe.");
        return;
    }

    libros.agregar(libro);
    }

    public void listarLibro(){
        libros.listar();
    }

    public void eliminarLibro(Libro libro){
        libros.eliminar(libro);
    }

    public Libro buscarLibro(int codigo){
        return libros.buscar(codigo);
    }

    //--------------------

    public void agregarSocio(Socio socio){
        socios.agregar(socio);
    }

    public void listarSocio(){
        socios.listar();
    }

    public void eliminarSocio(Socio socio){
        socios.eliminar(socio);
    }

    public Socio buscarSocio(int codigo){
        return socios.buscar(codigo);
    }

    //-----------------------------------

    public void ordenarLibrosPorCodigo(){
        Collections.sort(
            libros.getElementos(),
            Comparator.comparingInt(Libro::getCodigo)
        );
    }

    public void ordenarLibrosPorFecha(){
        Collections.sort(
            libros.getElementos(),
            Comparator.comparing(Libro::getFechaPublicacion)
        );
    }


    public void ordenarSocioPorCodigo(){
        Collections.sort(
            socios.getElementos(),
            Comparator.comparingInt(Socio::getCodigo)
        );
    }
    
    //----------------------------------------------
    
    public void guardarDatos(){
        Serializador.guardar(libros, "libro.dat");
        Serializador.guardar(socios, "socios.dat");
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
    }
    
    public void exportarLibro(){
        ExportadorTxt.exportarLibros(libros, "libro.txt");
    }
    
    
}
