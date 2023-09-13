package com.labs.java.concurrency;

public class ThreadWithRunnableDemo {
    public static void main(String[] args) {
        System.out.println("entered into "+Thread.currentThread().getName());
        CustonRunnableThread r1 = new CustonRunnableThread();
        for(int i =1; i<10;i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Thread t1 = new Thread(r1);
        t1.setName("T1");
        t1.start();

        Thread t2 = new Thread(r1);
        t2.setName("T2");
        t2.start();
//        t1.run();

        System.out.println("exited from "+Thread.currentThread().getName());
    }
}
