import java.util.Scanner;

public class MatrixMaxMin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of Rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter No of Columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];   

        System.out.println("Enter Elements in matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Matrix is: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        for(int i = 0; i < rows; i++){
            int max = matrix[i][0];
            int min = matrix[i][0];

            for(int j = 1; j < cols; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }

                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
        System.out.println();
        System.out.println("Row " + (i + 1) + " ->  Max: " + max + ", Min: " + min);
        }
    }
}
