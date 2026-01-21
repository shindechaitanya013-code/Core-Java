// Write an application which will accept a number from command line. If number is not
// divisible by 7, then throw “notDivisibleBy7” user defined Exception.

class notDivisibleBy7 extends Exception{
    public notDivisibleBy7(String msg){
        super(msg);
    }
}

public class DivisibleBy7{
    public static void main(String args[]){

        try{        
            if(args.length == 0){
                System.out.println("Please provide a number in command line!!");
                return;
            }

            int no = Integer.parseInt(args[0]);

            if(no % 7 != 0){
                throw new notDivisibleBy7("Number not divisible by 7");
            }
            
            System.out.println("Number " +no+ " is divisible by 7.");

        }catch(notDivisibleBy7 e){
            System.out.println("Exception: "+e.getMessage());

        }catch(NumberFormatException e){
                System.out.println("Please enter valid number!");
        }
    }
}
