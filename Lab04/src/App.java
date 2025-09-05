import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigDecimal;

class Main {
    public static void main(String[] args) throws SQLException {
        read();
    }

    public static void read() throws SQLException {
        String url = System.getenv("db.kbzflembzxipktguoxaz.supabase.co");
        String username = System.getenv("postgres");
        String password = System.getenv("C0BuJmcsVeEmOmVd");

        Connection c = DriverManager.getConnection(url, username, password);
        String sql = "SELECT * FROM contas";
        PreparedStatement stm = c.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            long nro = rs.getLong("nro_conta");
            BigDecimal saldo = rs.getBigDecimal("saldo");

            System.out.println("Conta numero: " + nro + " tem saldo de R$ " + saldo);
        }

        c.close();
    }
}