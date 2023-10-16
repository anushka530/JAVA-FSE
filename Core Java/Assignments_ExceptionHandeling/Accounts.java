
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class IllegalBankTransactionException extends Exception {
    public IllegalBankTransactionException(String message) {
        super(message);
    }
}

class SavingsAccount {
    private long id;
    private double balance;

    public SavingsAccount(long id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }

    public double withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
        if (amount < 0) {
            throw new IllegalBankTransactionException("Withdrawal amount cannot be negative.");
        }
        
        if (amount > balance || balance == 0) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        }

        balance -= amount;
        return balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class Accounts {
    public static void main(String[] args) {
        SavingsAccount savingAcc = new SavingsAccount(1, 2000);

        try {
            double withdrawnAmount = savingAcc.withdraw(2100);
            System.out.println("Withdrawal successful. Remaining balance: " + withdrawnAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalBankTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            double withdrawnAmount = savingAcc.withdraw(-1000);
            System.out.println("Withdrawal successful. Remaining balance: " + withdrawnAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalBankTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
