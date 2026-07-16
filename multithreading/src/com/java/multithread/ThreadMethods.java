package com.java.multithread;

public class ThreadMethods extends Thread{
    @java.lang.Override
    public void run() {
        for(int i = 1; i<=5; i++){
            try{
                Thread.sleep(2000);
                System.out.println(i);
            }catch(InterruptedException e){
                System.out.println("Thread interrupted" + e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ThreadMethods t1 = new ThreadMethods();
        t1.start(); // start the thread
        t1.interrupt();
        t1.join(); //main thread will wait for t1 to complete its execution
        System.out.println("Hello");
    }
}
