package pruebaautotest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Coneccion {

    private static Connection conn;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String pass = "";
    private static String url = "jdbc:mysql://localhost:3306/autotest";
    private Statement statement;

    public Coneccion() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Coneccion establecida.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public Connection getConn() {
        return conn;
    }
    
    public void createTable(String table) {
        try {
            statement = conn.createStatement();
            statement.executeUpdate(table);
            System.out.println("Tabla creada correctamente");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }    
}
