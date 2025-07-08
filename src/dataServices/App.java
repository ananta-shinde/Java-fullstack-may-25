package dataServices;

import java.sql.SQLException;
import java.util.Scanner;

public class App {

    private UserService userService;

    App() throws SQLException {
        userService = new UserService();
    }

    public void login(String email,String password) throws SQLException {
        User user = new User(email,password);
        user.setRole_id(1);
//            app.userService.createUser(user);
        User user2 =this.userService.getUser(user.getEmail());
        if(user2 == null){
            System.out.println("user does not exists");
        }else if(!user2.getPassword().equals(user.getPassword())){
            System.out.println("invalid creds");
        }else{
            System.out.println("login successful");
        }
    }

    public static void main(String[] args) {
        try{
            App app = new App();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your email");
            String email = sc.next();
            System.out.println("enter your password");
            String password = sc.next();
            app.login(email,password);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
