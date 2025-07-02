package dataServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public PreparedStatement getStatement(String query) throws SQLException{
        return conn.prepareStatement(query);
    }


}
