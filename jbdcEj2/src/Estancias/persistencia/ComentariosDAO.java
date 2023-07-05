/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;

import Estancias.entidades.Comentarios;
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
public class ComentariosDAO {

    private final Connection connection;

    public ComentariosDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Comentarios> listarComentarios() throws SQLException {
        List<Comentarios> comentarios = new ArrayList<>();
        String query = "SELECT * FROM comentarios";
        try (PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int idComentario = rs.getInt("id_comentario");

                int idCasa = rs.getInt("id_casa");

                String oracion = rs.getString("comentario");

                Comentarios comentario = new Comentarios(idComentario, idCasa, oracion);
                comentarios.add(comentario);
            }
        }
        return comentarios;
    }
}
