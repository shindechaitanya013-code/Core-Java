// Write a program to accept the number from user and accept the index from the number Insert the number into 1D array

import java.util.*;

public class InsertElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 60};

        int n = arr.length;

        int[] newArr = new int[n + 1];

        System.out.println("Enter number to be insert: ");
        int no = sc.nextInt();

        System.out.println("Enter index position: ");
        int index = sc.nextInt();

        for(int i = 0, j = 0; i < newArr.length; i++){
            if(i == index){
                newArr[i] = no;
            } else{
                newArr[i] = arr[j];
                j++;
            }
        }

        System.out.println("Array after insertion: ");
        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]+ " ");
        }
    }
}
