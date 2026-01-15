// Create a class Voter with attributes like voterName, voterAddress, voterContactNo, voterAadhaar, etc. Accept details of 10 voters using an array of objects and display the accepted details
import java.util.*;

class voter{
    String voterName;
    String voterAddress;
    String voterContactNo;
    String voterAadhar;

    void accept(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter voter name: ");
        voterName = sc.nextLine();

        System.out.println("Enter voter address: ");
        voterAddress = sc.nextLine();

        System.out.println("Enetr voter contact no: ");
        voterContactNo = sc.nextLine();

        System.out.println("Enter voter Aadhar: ");
        voterAadhar = sc.nextLine();
    }

    void display(){
        System.out.println("Name: "+voterName);
        System.out.println("Address: "+voterAddress);
        System.out.println("Contact: "+voterContactNo);
        System.out.println("Aadhar: "+voterAadhar);
        System.out.println("-------");
    }
}

public class VoterMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        voter[] voters = new voter[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Enter Details of voter " +(i+1));
            voters[i] = new voter();
            voters[i].accept();
        }

        System.out.println();
        System.out.println("---voter details---");
        for(int i = 0; i < 3; i++){
            voters[i].display();
        }
    }   
}


