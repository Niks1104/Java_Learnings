package com.java.multithread.basics;

public class MultithreadingTest {
    public static void main(String[] args) {

        //initiate a new thread, when a class is created by extending Thread class
        WorldThread worldThread = new WorldThread(); //New state
        worldThread.start(); //Runnable state

        //initiate a new thread, when a class is created by implementing Runnable interface
        ProgrammingThread programmingThread = new ProgrammingThread();
        Thread t1 = new Thread(programmingThread); //new state
        t1.start();//runnable state

        for(; ;){
            System.out.println("Hello");
        }

//        System.out.println(Thread.currentThread().getName());
    }
}