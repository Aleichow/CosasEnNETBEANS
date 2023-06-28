/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.servicios;

import Tienda.entidades.Producto;
import Tienda.persistencia.ProductoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProductoService {

    private final Connection connection;
    private ProductoDAO productoDAO;

    public ProductoService(Connection connection) {
        this.connection = connection;
        this.productoDAO = new ProductoDAO(connection);
    }

    public List<Producto> listarProductos() throws SQLException {
        return productoDAO.listarProductos();
    }

    public List<String> listarNombresProductos() throws SQLException {
        List<Producto> productos = productoDAO.listarProductos();
        List<String> nombresProductos = new ArrayList<>();
        productos.forEach((producto) -> {
            nombresProductos.add(producto.getNombre());
        });
        return nombresProductos;
    }

    public void listarNombresYPrecios() {
        try {
            List<Producto> productos = productoDAO.listarProductos();
            System.out.println("Nombres y precios de los productos:");
            for (Producto producto : productos) {
                System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarProductosPorRangoDePrecio() {
        try {
            List<Producto> productos = productoDAO.listarProductos();
            System.out.println("Productos con precio entre 120 y 202:");
            for (Producto producto : productos) {
                if (producto.getPrecio() >= 120 && producto.getPrecio() <= 202) {
                    System.out.println(producto.getNombre());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarPortatiles() {
        try {
            List<Producto> productos = productoDAO.listarProductos();
            System.out.println("Portátiles:");
            for (Producto producto : productos) {
                if (producto.getNombre().toLowerCase().contains("portátil")) {
                    System.out.println(producto.getNombre());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarProductoMasBarato() {
        try {
            List<Producto> productos = productoDAO.listarProductos();
            Producto productoMasBarato = null;
            for (Producto producto : productos) {
                if (productoMasBarato == null || producto.getPrecio() < productoMasBarato.getPrecio()) {
                    productoMasBarato = producto;
                }
            }
            if (productoMasBarato != null) {
                System.out.println("Producto más barato: " + productoMasBarato.getNombre()
                        + ", Precio: " + productoMasBarato.getPrecio());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarProducto() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese el código del fabricante: ");
        int codigoFabricante = scanner.nextInt();

        System.out.println("Ingrese el código del producto: ");
        int codigo = scanner.nextInt();

        Producto producto = new Producto(codigo, nombre, precio, codigoFabricante);

        String query = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setInt(1, producto.getCodigo());
            stmt.setString(2, producto.getNombre());
            stmt.setDouble(3, producto.getPrecio());
            stmt.setInt(4, producto.getCodigoFabricante());
            stmt.executeUpdate();
            System.out.println("Producto ingresado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al ingresar el producto.");
        }
    }

    public void editarProducto(int codigo) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        // Obtener el producto existente para editar
        Producto productoExistente = null;
        List<Producto> productos = productoDAO.listarProductos();
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                productoExistente = producto;
                break;
            }
        }

        if (productoExistente == null) {
            System.out.println("El producto con el código " + codigo + " no existe.");
            return;
        }

        // Solicitar los nuevos datos del producto
        System.out.println("Ingrese el nuevo nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el nuevo precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese el nuevo código del fabricante: ");
        int codigoFabricante = scanner.nextInt();

        // Crear un nuevo objeto Producto con los datos actualizados
        Producto productoActualizado = new Producto(codigo, nombre, precio, codigoFabricante);

        // Actualizar el producto en la base de datos
        String query = "UPDATE producto SET nombre = ?, precio = ?, codigo_fabricante = ? WHERE codigo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, productoActualizado.getNombre());
            stmt.setDouble(2, productoActualizado.getPrecio());
            stmt.setInt(3, productoActualizado.getCodigoFabricante());
            stmt.setInt(4, productoActualizado.getCodigo());
            stmt.executeUpdate();
            System.out.println("Producto actualizado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar el producto.");
        }
    }

}
