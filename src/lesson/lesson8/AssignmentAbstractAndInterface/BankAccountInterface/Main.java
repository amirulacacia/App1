package lesson.lesson8.AssignmentAbstractAndInterface.BankAccountInterface;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000, 500);
        SavingsAccount savingsAccount = new SavingsAccount(5000, 0.02);
        
        System.out.println("Checking Account: ");
        System.out.println("Balance: " + checkingAccount.getBalance());
        checkingAccount.deposit(500);
        System.out.println("Balance: " + checkingAccount.getBalance());
        checkingAccount.withdraw(1750);
        System.out.println("Balance: " + checkingAccount.getBalance());
        checkingAccount.withdraw(500);
        System.out.println("Balance: " + checkingAccount.getBalance());
        checkingAccount.deposit(500);
        System.out.println("Balance: " + checkingAccount.getBalance());

        System.out.println("Savings Account: ");
        System.out.println("Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(200);
        System.out.println("Balance: " + savingsAccount.getBalance());
        savingsAccount.withdraw(10000);
        System.out.println("Balance: " + savingsAccount.getBalance());
        savingsAccount.withdraw(2000);
        System.out.println("Balance: " + savingsAccount.getBalance());
    }
}
