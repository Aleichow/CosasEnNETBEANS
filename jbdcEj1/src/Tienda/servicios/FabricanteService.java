/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.servicios;

import Tienda.entidades.Fabricante;
import Tienda.persistencia.FabricanteDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FabricanteService {

    private final Connection connection;
    private final FabricanteDAO fabricanteDAO;

    public FabricanteService(Connection connection) {
        this.connection = connection;
        this.fabricanteDAO = new FabricanteDAO(connection);
    }

    public List<Fabricante> listarFabricantes() throws SQLException {
        return fabricanteDAO.listarFabricantes();
    }

    public void insertarFabricante() throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Fabricante: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el código del fabricante: ");
        int codigoFabricante = scanner.nextInt();

        Fabricante fabricante = new Fabricante(codigoFabricante, nombre);

        String query = "INSERT INTO fabricante (codigo, nombre) VALUES (?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setInt(1, fabricante.getCodigo());
            stmt.setString(2, fabricante.getNombre());
            stmt.executeUpdate();
            System.out.println("Fabricante ingresado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al ingresar el fabricante.");
        }
    }

}


