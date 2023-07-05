/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;

import Estancias.entidades.Estancias;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class EstanciasDAO {

    private final Connection connection;

    public EstanciasDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Estancias> listarEstancias() throws SQLException {
        List<Estancias> estancias = new ArrayList<>();
        String query = "SELECT * FROM estancias";
        try (PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int idEstancia = rs.getInt("id_estancia");
                int idCliente = rs.getInt("id_cliente");
                int idCasa = rs.getInt("id_casa");
                String nombreHuesped = rs.getString("nombre_huesped");
                Date fechaDesde = rs.getDate("fecha_desde");
                Date fechaHasta = rs.getDate("fecha_hasta");
                Estancias estancia = new Estancias(idEstancia, idCliente, idCasa, nombreHuesped, fechaDesde, fechaHasta);
                estancias.add(estancia);
            }
        }
        return estancias;
    }

}
