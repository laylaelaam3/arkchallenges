package Day7.bankaccount;


public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Checking Account Details:");
        System.out.println("Balance: $" + balance);
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }

    @Override
    public void deposit(double amount) {

    }


}