// Write a Java program to swap the first and last elements of an array and create a new array.

import java.util.*;

public class SwapArray {
    public static void main(String args[]){
        int arr[] = {10, 20, 30, 40, 50};

        int n = 5;

        int newarr[] = new int[n];

        for(int i = 0; i < n; i++){
            newarr[i] = arr[i];
        }

        int temp = newarr[0];
        newarr[0] = newarr[n - 1];
        newarr[n - 1] = temp;

        System.out.println("New Array after Swapping: ");
        for(int i = 0; i < n; i++){
            System.out.print(newarr[i]+ " ");
        }
    }

}
