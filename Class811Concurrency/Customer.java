package org.example.Class811Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Customer implements Runnable {
    private BankAccount account;
    private double depositAmount;
    private double withdrawAmount;

    public Customer(BankAccount account, double depositAmount, double withdrawAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        if (depositAmount > 0) {
            System.out.println("deposit of $" + depositAmount);
            account.deposit(depositAmount);
        }

        if (withdrawAmount > 0) {
            System.out.println("withdraw of $" + withdrawAmount);
            account.withdraw(withdrawAmount);
        }
    }
}
class BankAccount {
    private double balance = 0.0;

    public synchronized void deposit(double amount) {
        balance += amount;
    }
    public synchronized void withdraw(double amount) {
        if(amount<=balance){
            balance -= amount;
        }else{
            System.out.println("you have not enough money on your account");
        }
    }
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) throws InterruptedException {
        int initialBalance = 550;

        BankAccount bankAccount = new BankAccount(initialBalance);

        System.out.println("Balance from the beginning is " + bankAccount.getBalance());

        List<Thread> threads = new ArrayList<>();

        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for (int i = 0; i < 50; i++) {
            Customer depositCustomer = new Customer(bankAccount, 15.0, 0);
            Customer withdrawCustomer = new Customer(bankAccount, 0, 10.0);

          //  executorService.execute(depositCustomer +threads.get());
            executorService.execute(withdrawCustomer);
        }

       /* for (int i = 0; i < 15; i++) {
            Customer customer1 = new Customer(bankAccount, 15.0, 0);
            executorService.awaitTermination(1,TimeUnit.SECONDS);
            executorService.execute(customer1);
        }

        for (int i = 0; i < 15; i++) {
            Customer customer2 = new Customer(bankAccount, 0, 10.0);
            executorService.awaitTermination(1,TimeUnit.SECONDS);
            executorService.execute(customer2);
        }*/

        executorService.shutdown();


        System.out.println("Final balance: $" + bankAccount.getBalance());
    }
}
