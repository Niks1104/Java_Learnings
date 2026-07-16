package com.java.multithread.synchronization;

public class MyThread extends Thread{

    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    @java.lang.Override
    public void run() {
        for(int i=1; i<=1000; i++){
            counter.increment();
        }
    }
}
