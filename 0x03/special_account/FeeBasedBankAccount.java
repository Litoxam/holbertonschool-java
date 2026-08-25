import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {
    private int transactionCount;


    public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
        this.transactionCount = 0;
    }

    @Override
    public void withdraw(double value) throws InvalidOperationException {
        super.withdraw(value);
        transactionCount++;
        try {
            super.withdraw(0.10);
        } catch (InvalidOperationException e) {
        }
    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
        super.deposit(value);
        transactionCount++;
        try {
            super.withdraw(0.10);
        } catch (InvalidOperationException e) {
        }
    }

    public int getTransactionCount() {
        return transactionCount;
    }
}