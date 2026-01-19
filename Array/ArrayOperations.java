// Accept 5 numbers in the array
// a. print it in the ascending order.
// b. print the row wise addition of numbers.
// c. Average of the numbers
// d. Check whether the number is present in the array if present return index
// of the number
// e. Check whether the prime number is present in the array if present return
// the prime number with its index of the number.

import java.util.Scanner;

class ArrayOperations{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++){
            a[i] = sc.nextInt();
        }

        // a. Ascending order (simple sorting)
        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < 5; j++){
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nAscending Order:");
        for(int i = 0; i < 5; i++){
            System.out.print(a[i]+ " ");
        }

        // b. Addition of numbers
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum = sum + a[i];
        }
        System.out.println("\n\nAddition = " +sum);

        // c. Average
        double avg = sum / 5.0;
        System.out.println("Average = " +avg);

        // d. Search number
        System.out.print("\nEnter number to search: ");
        int search = sc.nextInt();
        boolean found = false;

        for(int i = 0; i < 5; i++){
            if(a[i] == search){
                System.out.println("Number found at index: " +i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Number not found");
        }

        // e. Prime numbers with index
        System.out.println("\nPrime numbers in array: ");
        for(int i = 0; i < 5; i++){
            int num = a[i];
            int count = 0;

            if(num > 1){
                for(int j = 1; j <= num; j++){
                    if (num % j == 0)
                        count++;
                }
                if(count == 2) {
                    System.out.println("Prime Number: " + num + " at index " +i);
                }
            }
        }
    }
}
