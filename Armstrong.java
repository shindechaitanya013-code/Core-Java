import java.util.Scanner;

public class Armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int original, digits = 0;
        double result = 0;

        original = num;

        while(original != 0){
            original /= 10;
            digits++;
        }

        original = num;
        while(original != 0){
            int remainder = original % 10;
            result += Math.pow(remainder, digits);
            original /= 10;
        }

        if(result == num){
            System.out.println(num+ " is an armstrong number");
        }else{
            System.out.println(num+" is not armstrong number");
        }
    }
}
