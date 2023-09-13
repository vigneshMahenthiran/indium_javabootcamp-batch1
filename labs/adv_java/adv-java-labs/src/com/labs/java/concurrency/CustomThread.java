package com.labs.java.concurrency;

public class CustomThread extends Thread{
    public void run(){
        System.out.println("entered into "+Thread.currentThread().getName());
        System.out.println("*********");
        System.out.println("exited from "+Thread.currentThread().getName());
    }
}
