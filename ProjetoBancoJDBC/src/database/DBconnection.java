package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

    public Connection connectSQL(String dbname, String user, String pass) {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
            if (con != null) {
                System.out.println("Banco de dados conectado!");
            } else {
                System.out.println("BD não conectado!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}




