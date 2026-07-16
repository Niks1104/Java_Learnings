package com.java.multithread.synchronization;

public class Test {

    public static void main(String[] args) {
        Counter counter = new Counter();

        //both threads are sharing same resource
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException ex){
            System.out.println(ex);
        }

        /*
            We are expecting 2000, but we will get inconsistent result, because both threads
            are using the same object of counter and there is a possibility that both thread
            access and increment counter object simultaneously.
            To prevent this we can make increment method synchronized to prevent race condition,
            now only 1 thread will access the counter object at a time,
            and we will get the consistent result
         */
        System.out.println(counter.getCount());
    }
}
