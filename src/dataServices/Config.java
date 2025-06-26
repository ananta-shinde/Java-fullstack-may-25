package dataServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Config {
    private  static Connection conn;

    private static Connection initConnection() throws SQLException {
//        Map map = conn.getTypeMap();
//        map.put("url","jdbc:mysql://localhost:3306/ecom_db?user=root");
//        map.put("user","root");
//        map.put("password","Demo@123");
//        conn.setTypeMap(map);
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom_db?user=root","root","Demo@123");
        return conn;
    }

    public static Connection getConnection() throws SQLException {
        if(conn == null){
            return conn = initConnection();
        }
        return conn;
    }

}
