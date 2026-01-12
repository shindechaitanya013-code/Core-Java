// Write a program to accept the index from the number and delete the number from 1D array

import java.util.*;

public class DeleteElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.println("Enter index position to be deleted: ");
        int index = sc.nextInt();

        int newArr[] = new int[n - 1];

        for(int i = 0, j = 0; i < n; i++){
            if(i == index){
                continue;
            }
            newArr[j] = arr[i];
            j++; 
        }

        System.out.println("Array after deletion: ");
        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]+ " ");
        }
    }
}
