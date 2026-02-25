import java.util.*;

public class DecToBin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Decimal Number: ");
        int decimal = sc.nextInt();

        int binary = 0;
        int place = 1;

        while(decimal > 0){
            int remainder = decimal % 2;
            binary = binary + remainder * place;
            decimal = decimal / 2;
            place = place * 10;
        }

        System.out.println("Binary Number is: "+binary);
    }
}
