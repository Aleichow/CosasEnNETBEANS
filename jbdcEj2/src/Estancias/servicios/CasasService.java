/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.servicios;

import Estancias.entidades.Casas;
import Estancias.persistencia.CasasDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class CasasService {

    private final CasasDAO casasDAO;
    private final Connection connection;

    public CasasService(Connection connection) {
        this.casasDAO = new CasasDAO(connection);
        this.connection = connection;
    }

    public List<Casas> listarCasas() throws SQLException {
        return casasDAO.listarCasas();
    }

    public void listarCasasDisponiblesEnPeriodo() throws SQLException {
        List<Casas> casasDisponibles = new ArrayList<>();
        String query = "SELECT * FROM casas WHERE fecha_desde >= '2020-08-01' AND fecha_hasta <= '2020-08-31' AND pais = 'Reino Unido'";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            try (ResultSet rs = stmt.executeQuery()) {
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

                    System.out.println(idCasa+ " " + calle + " "+ numero);
                }
            }
        }
       
    }

    public List<Casas> listarCasasDisponiblesEnPeriodoElegido(Date fechaInicio, Date fechaFin, String pais) throws SQLException {
        List<Casas> casasDisponibles = new ArrayList<>();
        String query = "SELECT * FROM casas WHERE fecha_disponible >= ? AND fecha_disponible <= ? AND pais = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setDate(1, fechaInicio);
            stmt.setDate(2, fechaFin);
            stmt.setString(3, pais);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int idCasa = rs.getInt("id_casa");
                    String calle = rs.getString("calle");
                    int numero = rs.getInt("numero");
                    String codigoPostal = rs.getString("codigo_postal");
                    String ciudad = rs.getString("ciudad");
                    int tiempoMinimo = rs.getInt("tiempo_minimo");
                    int tiempoMaximo = rs.getInt("tiempo_maximo");
                    double precioHabitacion = rs.getDouble("precio_habitacion");
                    String tipoVivienda = rs.getString("tipo_vivienda");
                    Casas casa = new Casas(idCasa, calle, numero, codigoPostal, ciudad, pais, fechaInicio, fechaFin, tiempoMinimo, tiempoMaximo, precioHabitacion, tipoVivienda);

                    casasDisponibles.add(casa);
                }
            }
        }
        return casasDisponibles;
    }

    public Map<String, Integer> obtenerNumeroCasasPorPais() throws SQLException {
        Map<String, Integer> numeroCasasPorPais = new HashMap<>();
        String query = "SELECT pais, COUNT(*) AS count FROM casas GROUP BY pais";
        try (PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                // Obtener valores de las columnas
                String pais = rs.getString("pais");
                int count = rs.getInt("count");

                // Agregar al mapa el número de casas por país
                numeroCasasPorPais.put(pais, count);
            }
        }
        return numeroCasasPorPais;
    }

    public void listarCasasDelReinoUnidoLimpias() throws SQLException {
        List<Casas> casasLimpias = new ArrayList<>();
        String query = "SELECT c.* FROM casas c RIGHT JOIN comentarios co ON c.id_casa = co.id_casa WHERE c.pais = 'Reino Unido' AND co.comentario LIKE '%limpia%'";
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

                System.out.println(idCasa+ " " + calle + " "+ numero);
            }
        }
      
    }

    public void incrementarPrecioCasasReinoUnido() throws SQLException {
        String query = "UPDATE casas SET precio_dia = precio_dia * 1.05 WHERE pais = 'Reino Unido'";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.executeUpdate();
        }

        for (Casas casa : listarCasas()) {
            System.out.println("Casa ID: " + casa.getIdCasa() + ", Precio por día actualizado: " + casa.getPrecioHabitacion() + ", Pais: " + casa.getPais());
        }

    }

}
