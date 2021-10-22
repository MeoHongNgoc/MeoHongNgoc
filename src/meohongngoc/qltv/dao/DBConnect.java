package meohongngoc.qltv.dao;

//import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
//import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
//import meohongngoc.qltv.model.DocGia;
   
/**
 *
 * @author MeoHongNgoc
 */
public class DBConnect {
//    String user = "sa";
//    String password = "25102000";
//    String url = "jdbc:sqlserver://MEO-HONG-NGOC\\SQLEXPRESS:1433;databaseName=MeoHongNgoc";
    
    
    public static Connection getConnection(){
            try {
                Connection cons = null;
                cons = DriverManager.getConnection("jdbc:sqlserver://MEO-HONG-NGOC\\SQLEXPRESS:1433;"
                        + "databaseName=MeoHongNgoc;"
                        + "user = sa ; password = 25102000");
                return cons;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return null;
        }
    
//    public static Connection getConnection() throws SQLException, ClassNotFoundException{
//        var server = "MEO-HONG-NGOC\\SQLEXPRESS";
//        var user = "sa";
//        var password = "25102000";
//        var db = "MeoHongNgoc";
//        var port = 1433;
//        SQLServerDataSource ds = new SQLServerDataSource();
//        ds.setUser(user);
//        ds.setPassword(password);
//        ds.setDatabaseName(db);
//        ds.setServerName(server);
//        ds.setPortNumber(port);
//
//        try {
//            Connection cons = null;
//            cons = ds.getConnection();
//        } catch (SQLServerException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    public static void main(String[] args) {
        new DBConnect();
    }
}
    