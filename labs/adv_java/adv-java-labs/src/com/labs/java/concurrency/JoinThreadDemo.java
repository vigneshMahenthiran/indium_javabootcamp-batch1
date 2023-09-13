package com.labs.java.concurrency;

public class JoinThreadDemo {
    public static void main(String[] args) {
        System.out.println("entered into "+Thread.currentThread().getName());
        CustonRunnableThread r1 = new CustonRunnableThread();

        Thread t1 = new Thread(r1);
        t1.setName("T1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread t2 = new Thread(r1);
        t2.setName("T2");
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        t1.run();
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
