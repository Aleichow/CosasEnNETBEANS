/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import Tienda.entidades.Producto;
import Tienda.persistencia.DAO;
import Tienda.persistencia.ProductoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import Tienda.servicios.ProductoService;
import Tienda.servicios.FabricanteService;
import java.util.List;

/**
 *
 * @author user
 */
public class JbdcEj1 {

 //   private static final String URL = "jdbc:mysql://localhost:3306/tienda";
   // private static final String USERNAME = "root";
    //private static final String PASSWORD = "root";

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // Establecer conexión con la base de datos
       // Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        DAO dao = new DAO();
        
        
        ProductoDAO productoDAO = new ProductoDAO(dao.getConnection()); 
        
        ProductoService productoService = new ProductoService(dao.getConnection());
        FabricanteService fabricanteService = new FabricanteService(dao.getConnection());
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Menú
        int opcion;
        do {
            System.out.println("------ MENÚ ------");
            System.out.println("1. Listar todos los productos");
            System.out.println("2. Listar nombres y precios de productos");
            System.out.println("3. Listar productos por rango de precio");
            System.out.println("4. Listar portátiles");
            System.out.println("5. Mostrar producto más barato");
            System.out.println("6. Insertar nuevo producto");
            System.out.println("7. Insertar nuevo fabricante");
            System.out.println("8. Editar producto");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        List<Producto> productos = productoService.listarProductos();
                        System.out.println("Listado de productos:");
                        for (Producto producto : productos) {
                            System.out.println(producto.toString());
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    productoService.listarNombresYPrecios();
                    break;
                case 3:
                    productoService.listarProductosPorRangoDePrecio();
                    break;
                case 4:
                    productoService.listarPortatiles();
                    break;
                case 5:
                    productoService.listarProductoMasBarato();
                    break;
                case 6:
                    try {
                        productoService.insertarProducto();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        fabricanteService.insertarFabricante();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    System.out.println("Inserte el codigo del producto que desea editar");
                    productoService.editarProducto(sc.nextInt());
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        // Cerrar la conexión a la base de datos
        dao.closeConnection();
 
    }
}
