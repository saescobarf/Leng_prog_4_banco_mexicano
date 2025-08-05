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
            // Carga del driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // datos de conexión 
            String url = "jdbc:sqlserver://LAPTOP-SERGIOAL\\SQLEXPRESS:1433;databaseName=Cajerobd;encrypt=false;";

            String user = "saescobarf";
            String password = "root12345.";

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa a SQL Server");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return con;
    }
}

