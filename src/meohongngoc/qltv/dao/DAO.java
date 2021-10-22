package meohongngoc.qltv.dao;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;

public class DAO {

    public static void main(String[] args) throws SQLException {
        var server = "MEO-HONG-NGOC\\SQLEXPRESS";
        var user = "sa";
        var password = "25102000";
        var db = "MeoHongNgoc";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);

        try (Connection conn = ds.getConnection()) {
            System.out.println("ket noi thanh cong.");
            System.out.println(conn.getCatalog());
        } catch (SQLServerException e) {
            e.printStackTrace();
        }

    }
}
