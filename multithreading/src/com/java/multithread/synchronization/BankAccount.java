package com.java.multithread.synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000); //simulate time taken to process withdrawal
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                    }catch(Exception e){
                        //to store the state of interrupted thread and it can be used for monitoring
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock(); //always unlock the lock in finally block
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " could not acquire lock, Try later");
            }
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
