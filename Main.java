import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Registrar socio");
            System.out.println("5. Listar socios");
            System.out.println("6. Eliminar socio");
            System.out.println("7. Ordenar libros por codigo");
            System.out.println("8. Ordenar libros por fecha");
            System.out.println("9. Ordenar socios");
            System.out.println("10. guardar datos");
            System.out.println("11. cargar datos");
            System.out.println("12. exportar libro");
            System.out.println("0. Salir");

            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el codigo: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el autor");
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el año: ");
                    int anio = scanner.nextInt();
                    System.out.println("Ingrese el mes: ");
                    int mes = scanner.nextInt();
                    System.out.println("Ingrese el dia: ");
                    int dia = scanner.nextInt();
                    LocalDate fecha = LocalDate.of(anio, mes, dia);

                    Libro libro = new Libro(codigo, autor, fecha);
                    biblioteca.agregarLibro(libro);



                    break;
                case 2:
                    biblioteca.listarLibro();
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del libro que desea eliminar: ");
                    int codigoBuscar = scanner.nextInt();
                    Libro libroEliminar = biblioteca.buscarLibro(codigoBuscar);
                    if (libroEliminar != null) {
                        biblioteca.eliminarLibro(libroEliminar);
                    }else{
                        System.out.println("No se encontro el libro");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese el numero de dni: ");
                    int dni = scanner.nextInt();
                    scanner.nextLine();
                    int id = scanner.nextInt();
                    
                    Socio socio = new Socio(nombre, apellido, dni, id);
                    biblioteca.agregarSocio(socio);
                    break;
                case 5:

                    biblioteca.listarSocio();
                    break;
                case 6:
                    System.out.println("Ingrese el numero de socio: ");
                    int numeroSocioBuscar = scanner.nextInt();
                    scanner.nextLine();
                    Socio socioEliminar = biblioteca.buscarSocio(numeroSocioBuscar);
                    if (socioEliminar != null) {
                        biblioteca.eliminarSocio(socioEliminar);
                    }else{
                        System.out.println("no existe el socio");
                    }

                    break;

                case 7:
                    biblioteca.ordenarLibrosPorCodigo();
                    biblioteca.listarLibro();
                    break;
                case 8:
                    biblioteca.ordenarLibrosPorFecha();
                    biblioteca.listarLibro();
                    break;
                case 9:
                    biblioteca.ordenarSocioPorCodigo();
                    biblioteca.listarSocio();
                    break;
                case 10:
                    biblioteca.guardarDatos();
                    break;
                case 11:
                    biblioteca.cargarDatos();
                case 12:
                    biblioteca.exportarLibro();
                default:
                    break;
            }




        }while(opcion != 0);

        scanner.close();
    }
    
    
}
