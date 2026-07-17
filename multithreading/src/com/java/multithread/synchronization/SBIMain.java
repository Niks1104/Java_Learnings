package com.java.multithread.synchronization;

public class SBIMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        //anonymous class
        Runnable task = new Runnable() {
            @Override
            public void run() {
                account.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();

    }
}
