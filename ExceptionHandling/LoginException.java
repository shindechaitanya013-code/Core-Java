import java.util.Scanner;

class UsernamePasswordException extends Exception{
    UsernamePasswordException(String s){
        super(s);
    }
}

class Login{
    String username, password;

    Scanner sc = new Scanner(System.in);

    void check(String username, String password) throws UsernamePasswordException{
       if(password.equals(username)){
            System.out.println("Successfully logged in");
       }else{
            throw new UsernamePasswordException("\nInvalid Password"); 
       } 
    }

    Login(){
        System.out.println("Enter Username: ");
        username = sc.nextLine();
        System.out.println("Enter Password: ");
        password = sc.nextLine();

        try{
            check(username,password);
        }catch(UsernamePasswordException e){
            e.printStackTrace();
        }
    }
}

public class LoginException {
    public static void main(String args[]){
        Login l = new Login();
    }    
}
