package Controller;

import java.sql.*;

/**
 * The type Db controller.
 */
public class DBController implements DBCredentials {

    private Connection conn;
    private ResultSet rs;
    private PreparedStatement stmt;

    /**
     * Instantiates a new Db controller.
     */
    public DBController() {
        initializeConnection();
    }

    /**
     * Initialize connection.
     */
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

    /**
     * Close.
     */
    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Select all result set.
     *
     * @param tableName the table name
     * @return the result set
     */
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

    /**
     * Select movies result set.
     *
     * @param theatreID the theatre id
     * @return the result set
     */
    public ResultSet selectMovies(int theatreID) {
        try {
            String query = "SELECT * FROM MOVIE WHERE TheatreID = ?";
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, theatreID);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
