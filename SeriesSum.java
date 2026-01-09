// WAP to Print the summation of series 1-2+3-4+5-6+7- ..........
// e.g input is 7 then output is 4

import java.util.*;

public class SeriesSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i<= num; i++){
            if(i % 2 == 0){
                sum = sum - i; //even
            }else{
                sum = sum + i; //odd
            }
        }

        System.out.println("Summation is: "+sum);
    }
}
