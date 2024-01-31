package Day7.bankaccount;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount implements Transactable {
    double balance;
    private String accountNumber;
    private List<String> trasactionHistory=new ArrayList<>();

    public BankAccount(double balance, String accountNumber, List<String> trasactionHistory) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.trasactionHistory = trasactionHistory;
    }

    public BankAccount(double balance) {
        this.balance=balance;
    }


    public void Dislaytrasanctionhistory() {
        System.out.println("transaction history for account number :" + accountNumber);
        trasactionHistory.forEach(System.out::println);
    }

    public void AddTrasaction(String transaction) {
        trasactionHistory.add(transaction);
    }

    public void deposit(double amount) {
        if( amount>0){
            balance += amount;
            trasactionHistory.add("deposit ");
        } else{
            System.out.println("Amount Error");
        }
    }

    public void withdraw(double amount) {
        if ( amount >0 && amount <= balance) {
            balance -= amount;
            trasactionHistory.add("Withdrawal: ");
        } else {
            System.out.println("Amount Error");
        }
    }

    public abstract void displayAccountDetails();
}

