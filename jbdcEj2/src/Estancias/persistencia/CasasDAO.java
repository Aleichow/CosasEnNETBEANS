/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;

import Estancias.entidades.Casas;
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
public class CasasDAO {
     private final Connection connection;

    public CasasDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Casas> listarCasas() throws SQLException {
        List<Casas> casas = new ArrayList<>();
        String query = "SELECT * FROM casas";
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int idCasa = rs.getInt("id_casa");
                String calle = rs.getString("calle");
                int numero = rs.getInt("numero");
                String codigoPostal = rs.getString("codigo_postal");
                String ciudad = rs.getString("ciudad");
                String pais = rs.getString("pais");
                Date fechaDesde = rs.getDate("fecha_desde");
                Date fechaHasta = rs.getDate("fecha_hasta");
                int tiempoMinimo = rs.getInt("tiempo_minimo");
                int tiempoMaximo = rs.getInt("tiempo_maximo");
                double precioHabitacion = rs.getDouble("precio_habitacion");
                String tipoVivienda = rs.getString("tipo_vivienda");
                Casas casa = new Casas(idCasa, calle, numero, codigoPostal, ciudad, pais, fechaDesde, fechaHasta, tiempoMinimo, tiempoMaximo, precioHabitacion, tipoVivienda);
                casas.add(casa);
            }
        }
        return casas;
    }
}
