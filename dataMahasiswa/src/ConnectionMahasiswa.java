import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionMahasiswa {
    private static Connection conn;
    
    public static Connection getConnectionMahasiswa(){
        String host = "jdbc:mysql://localhost:3306/mhs",
            user = "root",
            pass = "";
        
        try {
            // Memuat driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(host, user, pass);
            JOptionPane.showMessageDialog(null, "Koneksi berhasil.");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi: " + err.getMessage());
        }
        
        return conn;
    }
    
}


