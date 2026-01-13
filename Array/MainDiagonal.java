// Write a program to print main diagonal elements

import java.util.*;

public class MainDiagonal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        if(rows != cols){
            System.out.println("Main diagonal elements exits only for square matrix");
            return;
        }

        System.out.println("Main Diagonal elemets: ");
        for(int i = 0; i < rows; i++){
            System.out.println(matrix[i][i]+ " ");
        }
    }
}
