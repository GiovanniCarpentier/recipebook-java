package util;

import recipe.Recipe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlConnection {
    private static final String URL = "jdbc:mysql://localhost/recipebook";
    private static final String USERNAME = "java";
    private static final String PASSWORD = "java";
    private static final Logger LOGGER = Logger.getLogger(Recipe.class.getName());

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            // use connection
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, String.format("Error connecting to DB: %s", ex.getMessage()));
        }
    }
}
