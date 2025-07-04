package dataServices;

import java.sql.*;
import java.util.Calendar;

public class UserService {

    private StatementService service;

    UserService() throws SQLException {
        service = new StatementService();
    }

    public void createUser(User user) throws SQLException {
//        service.getStatement().executeUpdate("insert into users values(null,'"+name+"','"+email+"','"+password+"',null,1,1)");
        String query_template = "insert into users values(null,?,?,?,?,1,?,?)";
        PreparedStatement st =  service.getStatement(query_template);
        st.setString(1,user.getName());
        st.setString(2,user.getEmail());
        st.setString(3,user.getPassword());
        st.setDate(4,new Date(System.currentTimeMillis()));
        st.setInt(5,user.getRole_id());
        st.setString(6,user.getUid());
        st.executeUpdate();
    }

    public void getUser(Object value) throws SQLException{
        String query_template ;
        PreparedStatement st ;
        if(!value.getClass().getName().equals("String")){
            query_template = "select * from users where id = ?";
            st  = service.getStatement(query_template);
            st.setInt(1,(Integer)value);
        }else{
            query_template = "select * from users where email = ?";
            st  = service.getStatement(query_template);
            st.setString(1,(String)value);
        }

        ResultSet result = st.executeQuery();
        while(result.next()){
            System.out.println( result.getString("email"));
        }

    }

    public void getUserByEmail(String email) throws SQLException{
        String query_template = "select * from users where email = ?";
        PreparedStatement st  = service.getStatement(query_template);
        st.setString(1,email);
        ResultSet result = st.executeQuery();
        while(result.next()){
            System.out.println( result.getString("name"));
        }

    }
}
