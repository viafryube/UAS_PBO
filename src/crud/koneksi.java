
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class koneksi {
    private Connection connect;//variable yang definisikan koneksi terhadap sistem
    private final String driverName = "com.mysql.jdbc.Driver"; //initiate sebuah variable dgn value driver Database yang dituju
    private final String url = "jdbc:mysql://localhost:3306/crud";//initiate url yang digunakan untuk mengambil koneksi
    private final String username = "root";//initiate username untuk masuk ke dalam system
    private final String password = "";//initiate password untuk masuk ke dalam system
    public Connection getKoneksi() throws SQLException {
        if (connect == null) {
            //jika variable connect bernilai null, maka blok dibawah ini akan dijalankan
            try {
                Class.forName(driverName);//mengambil objek yang terkait kedalam kelas yang dimaksud
                System.out.println("Class Driver Ditemukan");

                connect = DriverManager.getConnection(url, username, password);
                //mengeset variable koneksi
                //dengan url yang dituju
                //dengan username masuk
                //dan password masuk
            } catch (ClassNotFoundException | SQLException se){
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, se);
                //menampilkan kesalahan pada eksekusi jika terjadi
            } 
        }
        //mengembalikan nilai terhadap variable connect
        return connect;
    }
}


