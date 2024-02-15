package lesson.lesson8.AssignmentAbstractAndInterface.BankAccountInterface;

public class CheckingAccount implements BankAccount {
    private double balance;
    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit)
            balance -= amount;
        else
            System.out.println("Overdraft limit exceeded...");

    }

    @Override
    public double getBalance() {
        return balance;
    }

}
