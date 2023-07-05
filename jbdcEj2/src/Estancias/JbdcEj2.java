/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias;

import Estancias.entidades.Casas;
import Estancias.entidades.Clientes;
import Estancias.entidades.Comentarios;
import Estancias.entidades.Familias;
import Estancias.entidades.Estancias;
import Estancias.persistencia.CasasDAO;
import Estancias.persistencia.ClientesDAO;
import Estancias.persistencia.ComentariosDAO;
import Estancias.persistencia.DAO;
import Estancias.persistencia.FamiliasDAO;
import Estancias.persistencia.EstanciasDAO;
import Estancias.servicios.CasasService;
import Estancias.servicios.ClientesService;
import Estancias.servicios.ComentariosService;
import Estancias.servicios.EstanciasService;
import Estancias.servicios.FamiliasService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public class JbdcEj2 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        try {

            DAO dao = new DAO();
            // Crear instancias de los DAO
            CasasDAO casasDAO = new CasasDAO(dao.getConnection());
            ClientesDAO clientesDAO = new ClientesDAO(dao.getConnection());
            ComentariosDAO comentariosDAO = new ComentariosDAO(dao.getConnection());
            FamiliasDAO familiasDAO = new FamiliasDAO(dao.getConnection());
            EstanciasDAO estanciasDAO = new EstanciasDAO(dao.getConnection());

            ClientesService clientesService = new ClientesService(dao.getConnection());
            CasasService casasService = new CasasService(dao.getConnection());
            ComentariosService comentariosService = new ComentariosService(dao.getConnection());
            EstanciasService estanciasService = new EstanciasService(dao.getConnection());
            FamiliasService familiasService = new FamiliasService(dao.getConnection());

            clientesService.listarClientesConEstancia();
            clientesService.listarEstanciasPorCliente();
            System.out.println("CASAS LIMPIAS");
            casasService.listarCasasDelReinoUnidoLimpias();
            System.out.println("CASAS EN PERIODO AGOSTO");
            casasService.listarCasasDisponiblesEnPeriodo();

// Obtener listas de objetos de cada tabla
            List<Casas> casas = casasDAO.listarCasas();
            List<Clientes> clientes = clientesDAO.listarClientes();
            List<Comentarios> comentarios = comentariosDAO.listarComentarios();
            List<Familias> familias = familiasDAO.listarFamilias();
            List<Estancias> estancias = estanciasDAO.listarEstancias();

            // Imprimir los resultados
            System.out.println("Casas:");
            for (Casas casa : casas) {
                System.out.println(casa);
            }

            System.out.println("Clientes:");
            for (Clientes cliente : clientes) {
                System.out.println(cliente);
            }

            System.out.println("Comentarios:");
            for (Comentarios comentario : comentarios) {
                System.out.println(comentario);
            }

            System.out.println("Familias:");
            for (Familias familia : familias) {
                System.out.println(familia);
            }

            System.out.println("Estancias:");
            for (Estancias estancia : estancias) {
                System.out.println(estancia);
            }

            // Cerrar la conexión a la base de datos
            dao.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
