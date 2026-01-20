interface Bank{
    void deposit(int amount);
    void withdraw(int amount);
}

class Account implements Bank{
    int balance = 5000;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    void display(){
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo{
    public static void main(String[] args){
        Account a = new Account();
        a.deposit(2000);
        a.withdraw(1000);
        a.display();
    }
}
