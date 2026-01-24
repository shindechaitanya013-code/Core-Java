class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}

class AgeDemo{
    public static void main(String[] args){

        int age = 15;

        try{
            if (age < 18)
                throw new AgeException("Not eligible to vote");
            System.out.println("Eligible to vote");
        } catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }
}
