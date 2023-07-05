/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;

import Estancias.entidades.Familias;
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
public class FamiliasDAO {

    private final Connection connection;

    public FamiliasDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Familias> listarFamilias() throws SQLException {
        List<Familias> familias = new ArrayList<>();
        String query = "SELECT * FROM familias";
        try (PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int idFamilia = rs.getInt("id_familia");
                String nombre = rs.getString("nombre");
                int edadMinima = rs.getInt("edad_minima");
                int edadMaxima = rs.getInt("edad_maxima");
                int numHijos = rs.getInt("num_hijos");
                String email = rs.getString("email");
                int idCasaFamilia = rs.getInt("id_casa_familia");
                Familias familia = new Familias(idFamilia, nombre, edadMinima, edadMaxima, numHijos, email, idCasaFamilia);
                familias.add(familia);
            }
        }
        return familias;
    }

    // Otros métodos para insertar, actualizar y eliminar registros en la base de datos
}
