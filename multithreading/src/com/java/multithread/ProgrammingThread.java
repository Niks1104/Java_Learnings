package com.java.multithread;

public class ProgrammingThread implements Runnable{

    @java.lang.Override
    public void run() {
        for (; ; ) {
            System.out.println("Programming");
        }
    }
}
