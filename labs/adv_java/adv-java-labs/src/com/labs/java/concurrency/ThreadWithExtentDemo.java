package com.labs.java.concurrency;

public class ThreadWithExtentDemo {
    public static void main(String[] args) {
        System.out.println("entered into "+Thread.currentThread().getName());
        CustomThread t1 = new CustomThread();
//        t1.run();
        t1.setName("T1");
        t1.start();
        CustomThread t2 = new CustomThread();
        t2.setName("T2");
        t2.start();
        try {
            Thread.sleep(5*60*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("exited from "+Thread.currentThread().getName());
    }
}
