package com.java.multithread;

public class ThreadMethods2 extends Thread{

    //We can set name of thread using constructor
    public ThreadMethods2(String name){
        super(name);
    }

    @java.lang.Override
    public void run() {
        for(int i = 0; i<5;i++){
            String a = "";
            for(int j = 0; j<10000000; j++){
                a+=a;
            }
            try{
                Thread.sleep(100);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority() + "- count " + i);
        }
    }

    public static void main(String[] args) {
        ThreadMethods2 low = new ThreadMethods2("Low Priority Thread");
        ThreadMethods2 med = new ThreadMethods2("Medium Priority Thread");
        ThreadMethods2 high = new ThreadMethods2("High Priority Thread");

        //set priority of threads
        low.setPriority(MIN_PRIORITY);
        med.setPriority(NORM_PRIORITY);
        high.setPriority(MAX_PRIORITY);

        low.start();
        med.start();
        high.start();
    }
}
