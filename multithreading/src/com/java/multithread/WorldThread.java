package com.java.multithread;

public class WorldThread extends Thread{
    @java.lang.Override
    public void run() {
        for( ; ; ){
            System.out.println("in the world of");
        }
    }
}
