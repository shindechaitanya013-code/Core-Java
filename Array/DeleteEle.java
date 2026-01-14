// Write a program to accept the 2D index from the number and delete the number from 2D array

import java.util.*;

public class DeleteEle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter row index to delete: ");
        int r = sc.nextInt();

        System.out.println("Enter column index to delete: ");
        int c = sc.nextInt();

        if(r >= 0 && r < rows && c >= 0 && c < cols){
            arr[r][c] = 0;
        } else{
            System.out.println("Invalid Index");
            return;
        }

        System.out.println("Matrix after deletion: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
