/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.persistencia;

import Tienda.entidades.Fabricante;
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
public class FabricanteDAO {

    private final Connection connection;

    public FabricanteDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Fabricante> listarFabricantes() throws SQLException {
        List<Fabricante> fabricantes = new ArrayList<>();
        String query = "SELECT * FROM fabricante";
        try (PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                Fabricante fabricante = new Fabricante(codigo, nombre);
                fabricantes.add(fabricante);
            }
        }
        return fabricantes;
    }

    // Agrega aquí otros métodos para insertar, actualizar, borrar y consultar fabricantes
    // según tus necesidades
}
