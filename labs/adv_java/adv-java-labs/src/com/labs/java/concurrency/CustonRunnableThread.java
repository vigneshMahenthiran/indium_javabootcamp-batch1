package com.labs.java.concurrency;

public class CustonRunnableThread implements Runnable{
    public void run(){
        System.out.println("entered into "+Thread.currentThread().getName());
        System.out.println("*********");
        for(int i =1; i<10;i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("exited from "+Thread.currentThread().getName());
    }

}
