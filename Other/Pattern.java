// Write a Java program to read the lines from console until the given line is “good bye”.
// Display those lines which contain the word “India” or “Hello”. Also count the number of
// lines in which pattern is found.

import java.util.*;

public class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String line;
        int count = 0;

        System.out.println("Enter lines (type 'good bye' to stop):");

        while(true){
            line = sc.nextLine();

            if (line.equals("good bye"))
                break;


            if(line.contains("India") || line.contains("Hello")){
                System.out.println(line);
                count++;
            }
        }

        System.out.println("Number of lines containing 'India' or 'Hello':  "+count);
    }
}
