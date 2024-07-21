package f_21_Conector;

import java.sql.*;
import java.util.Scanner;
//! Lo siguiente esta comentado por que no se usa (si hay problemas de ejecución, descomentar a discreción):
// import java.util.logging.Level; 
// import java.util.logging.Logger;

// Para poder hacer uso de esto(y que no arroje error), necesitamos primero arrancar XAMPP y encender MariaDB.
public class App {
    public static void main(String[] args) throws SQLException {
        try {
           //Conectar el driver para la base de datos
           Class.forName("org.mariadb.jdbc.Driver");
           Connection cnx = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/ce21", "root", "");
           
            System.out.println("Ingresa nuevo ciclo");
            Scanner teclado = new Scanner(System.in);
            String varl = teclado.next();
            
           PreparedStatement ps = cnx.prepareStatement("insert into ciclos[nombre] values[?]");
           ps.setString(1, varl);
           ps.execute();
           
           teclado.close();
           
           System.out.println("Conexion exitosa a la base de datos");
           
        } catch (ClassNotFoundException | SQLException ex) {
           System.out.println("Error" + ex);
        }
        
    }
}