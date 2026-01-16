// Define class Bank with data members as Cust_name, Ac_no and balance. Use
// constructors and method withdraw and deposit. Print the balance according to
// operation.
import java.util.*;

class Bank{
    String Cust_name;
    String Ac_no;    
    float balance;

    Bank(String Cust_name, String Ac_no, float balance){
        this.Cust_name = Cust_name;
        this.Ac_no = Ac_no;
        this.balance = balance;
    }

    void deposit(float amount){
        balance += amount;
        System.out.println();
        System.out.println("Amount Deposited: "+amount);
        System.out.println("Current Balance: "+balance);
    }

    void withdraw(float wi){
        if(balance > wi){
            balance -= wi;
            System.out.println();
            System.out.println("Amount Withdraw: "+wi);
            System.out.println("Current Balance: "+balance);
        }else{
            System.out.println();
            System.out.println("Insufficient Balance!");
            System.out.println("Current Balance: "+balance);

        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Bank b1 = new Bank("Chaitanya", "456278963", 5000.00f);

        System.out.println("Enter amount to deposit: ");
        float amount = sc.nextFloat();
        b1.deposit(amount);

        System.out.println();
        System.out.println("Enter amount to withdraw: ");
        float wi = sc.nextFloat();
        b1.withdraw(wi);
    }
}
