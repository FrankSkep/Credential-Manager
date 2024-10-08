package frank.credential_manager.Database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Getter;

import java.sql.Connection;
import java.sql.SQLException;

public class DB_Connection {

    private static HikariDataSource dataSource;
    
    @Getter
    private static String databasePath; // Ruta dinámica de la base de datos

    // Método para inicializar la base de datos con la ruta dinámica
    public static void initializeDatabase(String dbPath) {
        databasePath = dbPath;

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:sqlite:" + databasePath);
        config.setMaximumPoolSize(3);
        config.setPoolName("HikariSQLitePool");

        dataSource = new HikariDataSource(config);

        // Crear las tablas después de inicializar la conexión si es necesario
        try (Connection conn = dataSource.getConnection()) {
            DB_Initializer.initializeTables(conn);
        } catch (SQLException e) {
            System.out.println("Error inicializando las tablas: " + e.getMessage());
        }
    }

    // Obtener conexion
    public static Connection getConnection() throws SQLException {
        if (dataSource == null) {
            throw new SQLException("La base de datos no ha sido inicializada.");
        }
        return dataSource.getConnection();
    }

    // Cerrar conexion
    public static void close() {
        if (dataSource != null) {
            dataSource.close();
        }
    }
}
