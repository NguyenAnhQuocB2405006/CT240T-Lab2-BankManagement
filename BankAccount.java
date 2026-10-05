public abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Số dư không được âm"
            );
        }

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Số tiền phải lớn hơn 0"
            );
        }

        balance = balance + amount;
    }

    public abstract void withdraw(double amount)
            throws InsufficientBalanceException, InvalidAmountException;
}