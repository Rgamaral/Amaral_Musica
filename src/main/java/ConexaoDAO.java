import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/amaral_musicas";
    private static final String USER = "root";
    private static final String PASSWORD = "v1e2r3a4";

    public static Connection conectaBD() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao BD", e);
        }
    }
}
