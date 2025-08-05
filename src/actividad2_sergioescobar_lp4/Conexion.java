/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2_sergioescobar_lp4;

/**
 *
 * @author alexi
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
     public Connection getConnection() {
        Connection con = null;
        try {
            // Cargar el driver (opcional en JDBC 4.0+)
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Cambia estos valores por los tuyos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=LAPTOP-SERGIOAL\\SQLEXPRESS";
            String user = "tuUsuario";
            String password = "tuContraseña";

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a SQL Server");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return con;
    }
}
