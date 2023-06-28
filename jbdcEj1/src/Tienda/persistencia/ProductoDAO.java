/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.persistencia;

import Tienda.entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProductoDAO {

    private final Connection connection;

    public ProductoDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Producto> listarProductos() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        String query = "SELECT * FROM producto";
        try (PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int codigoFabricante = rs.getInt("codigo_fabricante");
                Producto producto = new Producto(codigo, nombre, precio, codigoFabricante);
                productos.add(producto);
            }
        }
        return productos;
    }

    

}


