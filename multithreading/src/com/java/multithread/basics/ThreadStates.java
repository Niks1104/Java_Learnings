package com.java.multithread.basics;

public class ThreadStates extends Thread{

    @java.lang.Override
    public void run() {
        System.out.println("RUNNING");
        try{
            Thread.sleep(2000); //thread t1 sleeps
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStates t1 = new ThreadStates();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState()); //main thread state
        Thread.sleep(100); //pause main thread
        System.out.println(t1.getState());
        t1.join(); //main thread will wait for t1 to complete its execution
        System.out.println(t1.getState()); //thread t1 complete its execution, hence terminated state

    }
}
