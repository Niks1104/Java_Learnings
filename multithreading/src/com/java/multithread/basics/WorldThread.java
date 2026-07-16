package com.java.multithread.basics;

public class WorldThread extends Thread{
    @java.lang.Override
    public void run() {
        for( ; ; ){
            System.out.println("in the world of");
        }
    }
}
