import java.util.*;

public class PrimeNumbersSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("\nPrime numbers between 2 and " + n + " are:");

        for(int i = 2; i < n; i++){
            boolean isPrime = true;

            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i+ " ");
                sum += i;
            }
        }
        System.out.println("\nSum of all prime numbers are: "+sum);
    }
}
