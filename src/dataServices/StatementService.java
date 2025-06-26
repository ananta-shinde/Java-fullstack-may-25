package dataServices;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementService {
    private Connection conn;
    public StatementService() throws SQLException {
        conn = Config.getConnection();
    }

    public Statement getStatement() throws SQLException {
        return conn.createStatement();
    }


}
