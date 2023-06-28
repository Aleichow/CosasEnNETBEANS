/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajbdc;


import java.sql.*;
import javax.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;




/**
 *
 * @author user
 */
public class PruebaJBDC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   {
    // Configura los detalles de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/nba";
        String username = "root";
        String password = "root";

        // Establece la conexión
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Crea una declaración SQL
            Statement statement = connection.createStatement();

            // Ejecuta la consulta SQL para obtener una tabla específica
            String query = "SELECT * FROM equipos";
            ResultSet resultSet = statement.executeQuery(query);

            // Itera sobre los resultados y muestra los datos
            while (resultSet.next()) {
                // Accede a los valores de cada columna por su nombre o índice
                String columna1 = resultSet.getString("Nombre");
                String columna2 = resultSet.getString("Ciudad");

                // Hacer algo con los datos obtenidos, como imprimirlos en la consola
                System.out.println("Columna1: " + columna1 + ", Columna2: " + columna2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}