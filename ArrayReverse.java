// Write a Java program to swap the first and last elements of an array and create a new array.

import java.util.*;

public class ArrayReverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        int n = 5;

        System.out.println("Reversed array: ");

        for(int i=n - 1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
