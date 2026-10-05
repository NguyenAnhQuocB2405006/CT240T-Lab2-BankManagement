import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankManager {

    private Map<String, BankAccount> accounts;

    public BankManager() {
        accounts = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public BankAccount findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void transferMoney(String fromAcc, String toAcc, double amount)
            throws InsufficientBalanceException, InvalidAmountException {

        BankAccount fromAccount = findAccount(fromAcc);
        BankAccount toAccount = findAccount(toAcc);

        if (fromAccount == null || toAccount == null) {
            throw new IllegalArgumentException("Account not found");
        }

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    public static double calculateTotalBalance(
            List<? extends BankAccount> accounts) {

        double total = 0;

        for (BankAccount account : accounts) {
            total += account.getBalance();
        }

        return total;
    }
}