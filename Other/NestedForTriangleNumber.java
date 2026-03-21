import java.util.*;

class NestedForTriangleNumber
{
    public static void main(String[] args)
    {
        int line, row, col, val, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines:");
        line = sc.nextInt();

        System.out.println("\nThe Pattern is\n");

        // First half pattern
        for(row = 1; row <= line; row++)
        {
            val = row;

            for(b = 1; b <= line - row; b++)
                System.out.print("  ");

            for(col = 1; col <= row; col++)
                System.out.print("  " + val++);

            // Second half pattern
            val = val - 2;

            for(b = 1; b <= row - 1; b++)
                System.out.print("  " + val--);

            System.out.println();
        }

        sc.close();
    }
}
