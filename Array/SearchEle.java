// Write a program to accept the number from user and check that number is
// present in the 2D array or not if the number is present return the 2D index of
// the present number else return number is not present.

import java.util.*;

public class SearchEle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] m = new int[rows][cols];

        System.out.println("Enter matrix elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number to be search: ");
        int num = sc.nextInt();

        boolean flag = false;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(m[i][j] == num){
                    System.out.println("Number found at index: (" +i+ ", " +j+ ")");
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }

        if(!flag){
            System.out.println("Number is not present in the 2D array");
        }
    }
}
