// Write a Java Program which stores the username and password in two variables. If
// username and password are not same, then raise “Invalid Password” with appropriate
// message.

class InvalidPasswordEception extends Exception{
    public InvalidPasswordEception(String msg){
        super(msg);
    }
}

public class UserPass{
    public static void main(String args[]){
        
        try{
            String userName = "abc";
            String passWord = "abc123";

            if(userName != passWord){
                throw new InvalidPasswordEception("Invalid Password: username and password do not match!");
            }

            System.out.println("Login Successful");

        }catch(InvalidPasswordEception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
