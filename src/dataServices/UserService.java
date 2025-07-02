package dataServices;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class UserService {

    private StatementService service;

    UserService() throws SQLException {
        service = new StatementService();
    }

    public void createUser(User user) throws SQLException {
//        service.getStatement().executeUpdate("insert into users values(null,'"+name+"','"+email+"','"+password+"',null,1,1)");
        String query_template = "insert into users values(null,?,?,?,null,1,1,?)";
        PreparedStatement st =  service.getStatement(query_template);
        st.setString(1,user.getName());
        st.setString(2,user.getEmail());
        st.setString(3,user.getPassword());
        st.setString(4,user.getUid());
        st.executeUpdate();
    }
}
