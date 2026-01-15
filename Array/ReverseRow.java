// Write a Java program to reverse each row of a matrix (2D array).

import java.util.*;

public class ReverseRow{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            int start = 0;
            int end = cols - 1;

            while(start < end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        System.out.println();
        System.out.println("Matrix after reversing each row: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
