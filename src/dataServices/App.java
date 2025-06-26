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
            app.userService.createUser();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
