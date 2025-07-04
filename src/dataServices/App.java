package dataServices;

import java.sql.SQLException;

public class App {

    private UserService userService;

    App() throws SQLException {
        userService = new UserService();
    }

    public static void main(String[] args) {
        try{
            App app = new App();
            User user = new User("Demo3","example02@example.com","1235456");
            user.setRole_id(1);
//            app.userService.createUser(user);
            app.userService.getUser(1);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
