import exceptions.InvalidOperationException;

public class BasicBankAccount {
    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    // Constructor
    public BasicBankAccount(String accountNumber, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.annualInterestRate = annualInterestRate;
        this.balance = 0;
    }

    // getter for accountNumber
    public String getAccountNumber(){
        return accountNumber;
    }

    // getter for balance
    public double getBalance(){
        return balance;
    }

    // getter for annualInterestRate
    public double getAnnualInterestRate(){
        return  annualInterestRate;
    }

    public void deposit(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Deposit amount must be greater than 0");
        }
        balance += value;
    }

    public void withdraw(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Withdrawal amount must be greater than 0");
        }
        if (value > balance) {
            throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
        }
        balance -= value;
    }

    public double calculateMonthlyFee() {
        double percentageFee = balance * 0.10;
        if (percentageFee < 10.00) {
            return percentageFee;
        }
        return 10.00;
    }

    public double calculateMonthlyInterest() {
        if (balance < 0) {
            return 0;
        }
        return balance * (annualInterestRate / 100) / 12;
    }

    public void applyMonthlyUpdate() {
        balance -= calculateMonthlyFee();
        balance += calculateMonthlyInterest();
    }


}
