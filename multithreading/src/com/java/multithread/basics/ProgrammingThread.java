package com.java.multithread.basics;

public class ProgrammingThread implements Runnable{

    @java.lang.Override
    public void run() {
        for (; ; ) {
            System.out.println("Programming");
        }
    }
}
