// Write a program to accept the number from user and accept the 2D index from the number Insert the number into 2D array
import java.util.*;

public class InsertEle{
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

        System.out.println("Enter number to insert in 2D array: ");
        int num = sc.nextInt();

        System.out.println("Enter row index: ");
        int r = sc.nextInt();

        System.out.println("Enter column index: ");
        int c = sc.nextInt();

        if(r >= 0 && r < rows && c >= 0 && c < cols){
            arr[r][c] = num;
        }else{
            System.out.println("Invalid index");
            return;
        }

        System.out.println("Matrix after insertion: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
