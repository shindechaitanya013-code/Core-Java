import java.util.Scanner;

class EvenOddCount{
    public static void main(String args[]) {
        int n, even = 0, odd = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Counting even and odd numbers
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
    }
}
