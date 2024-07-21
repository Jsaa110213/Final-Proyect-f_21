package f_21_Conector;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class Conexion {

    // Atributos de la clase Conexion
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;

    // Codigo principal
    public Connection conectar(){
        try {
           //Conectar el driver para la base de datos
           Class.forName("org.mariadb.jdbc.Driver");
           this.cnx = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/ce21", "root", "");
//           PreparedStatement ps = cnx
           System.out.println("Conexion exitosa a la base de datos");
           
        } catch (ClassNotFoundException | SQLException ex) {
           System.out.println("Error" + ex);
        }
        return cnx;
    }

    // Método de desconeción
    public void desconectar() {
        try {
            System.out.println("");
            System.out.println("Cerrando la conexion...");
            this.cnx.close();
        } catch (Exception ex) {
            System.out.println("Error al cerrar la conexion");
        }
    }
}