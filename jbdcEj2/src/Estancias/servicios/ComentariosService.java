/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.servicios;

import Estancias.entidades.Comentarios;
import Estancias.persistencia.ComentariosDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public class ComentariosService {

    private final ComentariosDAO comentariosDAO;
    private final Connection connection;

    public ComentariosService(Connection connection) {
        this.connection = connection;
        this.comentariosDAO = new ComentariosDAO(connection);
    }

    public List<Comentarios> listarComentarios() throws SQLException {
        return comentariosDAO.listarComentarios();
    }
}
