/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.servicios;

import Estancias.entidades.Familias;
import Estancias.persistencia.FamiliasDAO;
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
public class FamiliasService {

    private final FamiliasDAO familiasDAO;
    private final Connection connection;

    public FamiliasService(Connection connection) {
        this.connection = connection;
        this.familiasDAO = new FamiliasDAO(connection);
    }

    public List<Familias> listarFamilias() throws SQLException {
        return familiasDAO.listarFamilias();
    }

    public void listarFamiliaCon3oMas() {
        try {
            List<Familias> familias = familiasDAO.listarFamilias();
            System.out.println("Familias con al menos 3 hijos");
            for (Familias f1 : familias) {
                if (f1.getNumHijos() >= 3) {
                    System.out.println(f1.getNombre());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Familias> listarFamiliasConEmailHotmail() throws SQLException {
        List<Familias> familias = new ArrayList<>();
        String query = "SELECT * FROM familias WHERE email LIKE '%@hotmail%'";
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

}
