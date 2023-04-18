package mvc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection()throws SQLException, ClassNotFoundException{
        Connection conn =null;
        String url = "jdbc:mysql//localhost:3306/JSPBookDB";
        String user="root";
        String password = "java";
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspbookdb","root","java");
        return conn;
    }
}
