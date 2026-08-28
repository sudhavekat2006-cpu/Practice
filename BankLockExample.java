 import java.nio.file.*;

class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        System.out.println(java.lang.Thread.currentThread().getName() + " is depositing " + amount);
        balance += amount;
        System.out.println(java.lang.Thread.currentThread().getName() + " → New Balance = " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private int amount;

    public DepositThread(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(amount);
            try {
                java.lang.Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
    }

    public void join() {
    }
}

public class BankLockExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        DepositThread t1 = new DepositThread(account, 100, "Thread-A");
        DepositThread t2 = new DepositThread(account, 200, "Thread-B");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nFinal Balance = " + account.getBalance());
    }
}{
}
