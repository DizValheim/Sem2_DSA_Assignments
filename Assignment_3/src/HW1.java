/*Create a class Bank with instance variables account_no, name, and balance of the customer.
If the input balance is less than or equal to zero then create an Exception called “Invalid
BalanceException” and throw it using Java. Display the custom message “Balance cannot be 
less than 0”. */

import java.util.Scanner;

class InvalidBalanceException extends Exception
{
    InvalidBalanceException(String message)
    {
        super (message);
    }
}

class Bank 
{
    long accountNo;
    String name;
    double balance;
    
    public Bank(int accountNo, String name, double balance) throws InvalidBalanceException 
    {
        if (balance < 0) 
        {
            throw new InvalidBalanceException("Balance cannot be less than 0");
        }

        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InvalidBalanceException 
    {
        if (amount > balance) {
            throw new InvalidBalanceException ("Balance cannot be less than 0");
        }
        balance -= amount;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
public class HW1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter account number:");
        int accountNo = sc.nextInt();
        System.out.println("Enter balance:");
        double balance = sc.nextDouble();

        try
        {
            Bank bank = new Bank(accountNo, name, balance);

            System.out.println("Details of the Account Holder:");
            System.out.println("Name: " + bank.getName());
            System.out.println("Account number: " + bank.getAccountNo());
            System.out.println("Balance: " + bank.getBalance());

            System.out.println("Enter the money to withdraw:");
            double amount = sc.nextDouble();
            
            bank.withdraw(amount);
            System.out.println("After withdraw, Balance = " + bank.getBalance());
        
        } catch (InvalidBalanceException e) 
        {
            System.out.println(e);
        } 
        sc.close();
    }
}



