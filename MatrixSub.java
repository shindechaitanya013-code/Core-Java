import java.util.Scanner;

class MatrixSub{
    public static void main(String[] args) {
        int i, j;
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sub = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of first matrix:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix subtraction
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subtraction of matrices:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }
}

