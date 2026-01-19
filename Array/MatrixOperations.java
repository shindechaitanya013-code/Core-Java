// Accept 2D array and perform following operation
// a. Row wise addition of matrix
// b. Column wise addition of matrix
// c. Row wise Minimum and Maximum number
// d. Column wise Minimum and Maximum number

import java.util.Scanner;

class MatrixOperations{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                a[i][j] = sc.nextInt();
            }
        }

        // a. Row-wise addition
        System.out.println("\nRow-wise addition:");
        for (int i = 0; i < rows; i++){
            int sum = 0;
            for (int j = 0; j < cols; j++){
                sum = sum + a[i][j];
            }
            System.out.println("Row " +(i + 1)+ " sum = " + sum);
        }

        // b. Column-wise addition
        System.out.println("\nColumn-wise addition:");
        for (int j = 0; j < cols; j++){
            int sum = 0;
            for (int i = 0; i < rows; i++){
                sum = sum + a[i][j];
            }
            System.out.println("Column " +(j + 1)+ " sum = " + sum);
        }

        // c. Row-wise min and max
        System.out.println("\nRow-wise Min and Max:");
        for (int i = 0; i < rows; i++){
            int min = a[i][0];
            int max = a[i][0];

            for (int j = 0; j < cols; j++){
                if (a[i][j] < min)
                    min = a[i][j];
                if (a[i][j] > max)
                    max = a[i][j];
            }
            System.out.println("Row " +(i + 1)+ " Min = " + min + ", Max = " + max);
        }

        // d. Column-wise min and max
        System.out.println("\nColumn-wise Min and Max:");
        for (int j = 0; j < cols; j++){
            int min = a[0][j];
            int max = a[0][j];

            for (int i = 0; i < rows; i++){
                if (a[i][j] < min)
                    min = a[i][j];
                if (a[i][j] > max)
                    max = a[i][j];
            }
            System.out.println("Column " +(j + 1)+ " Min = " + min + ", Max = " + max);
        }
    }
}
