import java.util.Scanner;

class NameId{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name:");
    String name = sc.next();

    System.out.println("Enter Your ID: ");
    int id = sc.nextInt();

		System.out.println("Your name is: " +name);
    System.out.println("Your ID is: " +id);
	}
}
