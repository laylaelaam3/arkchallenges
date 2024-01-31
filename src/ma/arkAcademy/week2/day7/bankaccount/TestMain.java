package Day7.bankaccount;

public class TestMain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(10000,20);
        CheckingAccount checkingAccount = new CheckingAccount(5500,2);

        savingsAccount.deposit(500);
        checkingAccount.deposit(200);
        savingsAccount.withdraw(100);
        checkingAccount.displayAccountDetails();
    }
}
