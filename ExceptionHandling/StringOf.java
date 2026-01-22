// Accept a string from command line, if the string is in uppercase then throw user defined
// exception.

class UpperCaseException extends Exception{
    public UpperCaseException(String msg){
        super(msg);
    }
}

public class StringOf{
    public static void main(String args[]){
        
        try{
            if(args.length == 0){
                System.out.println("Please enter a string in command line!");
                return;
            }

            String str = args[0];

            if (str.equals(str.toUpperCase())){
                throw new UpperCaseException("String is in uppercase");
            }

            System.out.println("String is not in upper case");

        }catch(UpperCaseException msg){
            System.out.println("Exception: "+msg);
        }
    }
}
