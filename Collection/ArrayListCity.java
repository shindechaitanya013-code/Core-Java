import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCity{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Total Number of city: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Enter City Name: ");
            String city = sc.next();
            list.add(city);
        }

        System.out.println("\nArray List contains: "+list);
        list.clear();
        System.out.println("After using clear method: ");
        System.out.println("Array List contains: "+list);
    }
}
