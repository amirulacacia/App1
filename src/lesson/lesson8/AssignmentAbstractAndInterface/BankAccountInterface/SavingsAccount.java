package lesson.lesson8.assignmentabstractandinterface.bankaccountinterface;

public class SavingsAccount implements BankAccount {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance)
            this.balance -= amount;
        else
            System.out.println("Insuffecient funds...");

    }

    @Override
    public double getBalance() {
        balance += balance * interestRate;
        return balance;
    }

}
