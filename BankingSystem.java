import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) throws InvalidInputException {
        if (accountNumber <= 0) {
            throw new InvalidInputException("Account number must be positive.");
        }
        if (balance < 0) {
            throw new InvalidInputException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidInputException {
        if (amount <= 0) {
            throw new InvalidInputException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) throws InvalidInputException {
        if (amount <= 0) {
            throw new InvalidInputException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InvalidInputException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account number: ");
            int accNo = sc.nextInt();

            System.out.print("Enter initial balance: ");
            double initBalance = sc.nextDouble();

            BankAccount account = new BankAccount(accNo, initBalance);

            account.displayBalance();

            System.out.print("Enter deposit amount: ");
            double depositAmt = sc.nextDouble();
            account.deposit(depositAmt);

            System.out.print("Enter withdrawal amount: ");
            double withdrawAmt = sc.nextDouble();
            account.withdraw(withdrawAmt);

            account.displayBalance();

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
