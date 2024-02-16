package lesson.lesson8.AssignmentAbstractAndInterface.BankingSystemWithTransaction;

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

        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        checkingAccount.transfer(savingsAccount, 1000);
        checkingAccount.transfer(savingsAccount, 250);
        savingsAccount.transfer(checkingAccount, 2000);
        savingsAccount.transfer(checkingAccount, 500);
        checkingAccount.transfer(savingsAccount, 1000);
        savingsAccount.transfer(checkingAccount, 100);

        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        System.out.println("Checking Account Transaction history: \n" + checkingAccount.getTransactionHistory());
        System.out.println("Savings Account Transaction history: \n" + savingsAccount.getTransactionHistory());
        
    }
}
