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
            User user = new User("Demo2","example@example.com","1235456");
            app.userService.createUser(user);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
