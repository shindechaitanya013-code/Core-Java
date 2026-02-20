import java.util.Scanner;

class maxmethod{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the A value: ");
        int a = sc.nextInt();

        System.out.println("Enter the B value: ");
        int b = sc.nextInt();

        System.out.println("Enter the C value: ");
        int c = sc.nextInt();

        System.out.println("The maximum of first two numbers are " + maxi(a, b));

        System.out.println("The maximum of given three numbers are " + maxi(a, b, c));

        sc.close();
    }

    static int maxi(int m, int n) {
        if (m > n)
            return m;
        else
            return n;
    }

    static int maxi(int m, int n, int k) {
        return maxi(maxi(m, n), k);
    }
}
