package dataServices;

import java.sql.SQLException;

public class UserService {

    private StatementService service;

    UserService() throws SQLException {
        service = new StatementService();
    }

    public void createUser() throws SQLException {
        service.getStatement().executeUpdate("insert into users values(null,'Ananta','demo@mail.com','123456',null,1,1)");
    }
}
