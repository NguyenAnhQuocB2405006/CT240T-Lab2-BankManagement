public class SavingAccount extends BankAccount {

    private double interestRate;

    public SavingAccount(String accountNumber, String holderName,
                         double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount)
            throws InsufficientBalanceException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Số tiền rút phải lớn hơn 0"
            );
        }
        if (getBalance() - amount < 50000) {
            throw new InsufficientBalanceException(
                    "Số dư tài khoản tiết kiệm phải duy trì tối thiểu 50.000 VNĐ"
            );
        }
        setBalance(getBalance() - amount);
    }
}