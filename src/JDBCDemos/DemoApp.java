package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;

public class DemoApp {

    public static void main(String[] args) {
        try{
            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // get Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_demo?user=root","root","Demo@1234");
            System.out.println(conn);
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
