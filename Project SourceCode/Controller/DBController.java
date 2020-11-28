package Controller;

import java.sql.*;

public class DBController implements DBCredentials {

    private Connection conn;
    private ResultSet rs;
    private PreparedStatement stmt;

    public DBController() {
        initializeConnection();
    }

    public void initializeConnection() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Problem");
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet selectAll(String tableName) {
        try {
            String query = "SELECT * FROM " + tableName;
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
