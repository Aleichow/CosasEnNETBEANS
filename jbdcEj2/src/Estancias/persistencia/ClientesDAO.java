/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;

import Estancias.entidades.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ClientesDAO {
   private final Connection connection;

    public ClientesDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Clientes> listarClientes() throws SQLException {
        List<Clientes> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes";
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int idCliente = rs.getInt("id_cliente");
                String nombre = rs.getString("nombre");
                String calle = rs.getString("calle");
                int numero = rs.getInt("numero");
                String codigoPostal = rs.getString("codigo_postal");
                String ciudad = rs.getString("ciudad");
                String pais = rs.getString("pais");
                String email = rs.getString("email");
                Clientes cliente = new Clientes(idCliente, nombre, calle, numero, codigoPostal, ciudad, pais, email);
                clientes.add(cliente);
            }
        }
        return clientes;
    } 
}
