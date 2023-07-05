/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.servicios;

import Estancias.entidades.Clientes;

import Estancias.persistencia.ClientesDAO;
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
public class ClientesService {

    private final ClientesDAO clientesDAO;
    private final Connection connection;

    public ClientesService(Connection connection) {
        this.clientesDAO = new ClientesDAO(connection);
        this.connection = connection;
    }

    public List<Clientes> listarClientes() throws SQLException {
        return clientesDAO.listarClientes();
    }

    public void listarClientesConEstancia() throws SQLException {
        List<Clientes> clientesConEstancia = new ArrayList<>();
        String query = "SELECT c.*, e.tipo_vivienda "
                + "FROM clientes c "
                + "INNER JOIN estancias es ON c.id_cliente = es.id_cliente "
                + "INNER JOIN casas e ON es.id_casa = e.id_casa";
        try (PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {

                String nombreCliente = rs.getString("nombre");
                // Obtener valores de la descripción de la casa
                System.out.println(nombreCliente);
            }
        }

    }

    public void listarEstanciasPorCliente() throws SQLException {

        String query = "SELECT c.nombre, c.pais, c.ciudad, es.* "
                + "FROM clientes c "
                + "INNER JOIN estancias es ON c.id_cliente = es.id_cliente "
                + "INNER JOIN casas e ON es.id_casa = e.id_casa";
        try (PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                // Obtener valores de las columnas de clientes
                String nombreCliente = rs.getString("nombre");

                int idEstancia = rs.getInt("id_estancia");
                // Obtener otros valores de la estancia (casas) si es necesario
                System.out.println(nombreCliente + " " + idEstancia);

            }
        }

    }

}
