package org.example.Class811Concurrency;

public class Account implements Runnable {
    private static double balance = 0;

    public  synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " | New balance: $" + balance);
    }
    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " | New balance: $" + balance);
        }else{
            System.out.println("not enough money");
        }
    }
    public static double getBalance() {
        return balance;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            deposit(100);
        }
        for (int i = 1; i <= 3; i++) {
            withdraw(75);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Account account= new Account();

        Thread deposit1 = new Thread(account);
        Thread deposit2 = new Thread(account);
        Thread withdraw1 = new Thread(account);
        Thread withdraw2 = new Thread(account);


        deposit1.start();
        deposit2.start();
        withdraw1.start();
        withdraw2.start();


        System.out.println("Final balance: $" + getBalance());
    }

}

