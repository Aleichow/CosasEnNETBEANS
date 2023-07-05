/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaej1;

import java.util.List;
import java.util.Scanner;
import jpaej1.servicio.AutorServicio;
import jpaej1.servicio.EditorialServicio;
import jpaej1.servicio.LibroServicio;

/**
 *
 * @author user
 */
public class JPAEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        LibroServicio libroService = new LibroServicio();
        AutorServicio autorService = new AutorServicio();
        EditorialServicio editorialService = new EditorialServicio();

        boolean salir = false;

        while (!salir) {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Crear Libro");
            System.out.println("2. Editar Libro");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Buscar Autor por Nombre");
            System.out.println("5. Buscar Libro por ISBN");
            System.out.println("6. Buscar Libro por Título");
            System.out.println("7. Buscar Libro/s por nombre de Autor");
            System.out.println("8. Buscar Libro/s por nombre de Editorial");
            System.out.println("9. Imprimir libros");
            System.out.println("10. Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    libroService.crearLibro();
                    break;
                case 2:
                    libroService.editarLibro();
                    break;
                case 3:

                    System.out.println("Dame el ISBN del libro que queres eliminar");
                    Long tempLong = scanner.nextLong();

                    libroService.eliminarLibro(tempLong);
                    break;
                case 4:
                    autorService.buscarAutorPorNombre();
                    break;
                case 5:
                    libroService.buscarLibroPorISBN();
                    break;
                case 6:
                    libroService.buscarLibroPorTitulo();
                    break;
                case 7:
                    libroService.buscarLibroPorNombreAutor();
                    break;
                case 8:
                    libroService.buscarLibroPorNombreEditorial();
                    break;
                case 9:
                    libroService.imprimirListaLibros();
                    break;
                case 10:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        libroService.cerrar();
        autorService.cerrar();
        editorialService.cerrar();
    }

}
