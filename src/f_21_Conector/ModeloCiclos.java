package f_21_Conector;

import java.sql.*;
import java.util.ArrayList;
//import java.util.Scanner;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;
// import java.util.logging.Level;
// import java.util.logging.Logger;

public class ModeloCiclos extends Conexion {

    Ciclo ciclo;
//    Scanner teclado = new Scanner(System.in);
    ArrayList<Ciclo> carteraCiclos = new ArrayList<>();

    public ArrayList consulta() {   
        this.carteraCiclos.clear();
        System.out.println("Procendo la consulta");
        this.conectar();

        try {
            this.ps = this.cnx.prepareStatement("select * from ciclos");
            this.rs = this.ps.executeQuery();

            while (rs.next()) {
//                System.out.println(rs.getString("nombre"));
                this.ciclo = new Ciclo(rs.getInt("id"), rs.getString("nombre"));
                this.carteraCiclos.add(ciclo);
            }
        } catch (SQLException ex) {
            System.out.println("Listo" + ex.getMessage());
        }

        this.desconectar();
        return this.carteraCiclos;
    }
}
