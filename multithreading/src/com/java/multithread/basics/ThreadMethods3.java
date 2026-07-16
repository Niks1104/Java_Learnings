package com.java.multithread.basics;

public class ThreadMethods3 extends Thread{

    public ThreadMethods3(String name){
        super(name);
    }

    @java.lang.Override
    public void run() {
//        for (int i = 1; i<=5; i++){
//            System.out.println(Thread.currentThread().getName() + " is running");
//            Thread.yield();
//        }

        while(true){
            System.out.println("Hello world!");
        }
    }

    public static void main(String[] args) {
        ThreadMethods3 t1 = new ThreadMethods3("t1");
        t1.setDaemon(true);
//        ThreadMethods3 t2 = new ThreadMethods3("t2");

        t1.start();
//        t2.start();

        System.out.println("Main Done!");
    }
}
