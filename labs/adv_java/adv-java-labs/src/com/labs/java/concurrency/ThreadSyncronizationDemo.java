package com.labs.java.concurrency;

public class ThreadSyncronizationDemo {
    public static void main(String[] args) {
        System.out.println("Entered into - "+Thread.currentThread().getName());
        SequenceGenerator seqGen = new SequenceGenerator();
        SequenceThread t1 = new SequenceThread();
        t1.setName("T1");
        t1.start();

        SequenceThread t2 = new SequenceThread();
        t2.setName("T2");
        t2.start();

        SequenceThread t3 = new SequenceThread();
        t3.setName("T3");
        t3.start();
        System.out.println("Exited from - "+Thread.currentThread().getName());
    }
}

class SequenceThread extends Thread{
    public void run(){
        System.out.println("Entered into - "+Thread.currentThread().getName());
        SequenceGenerator seqGen = new SequenceGenerator();
        seqGen.increment();
        seqGen.decrement();
        seqGen.increment();
        System.out.println(Thread.currentThread().getName()+" "+seqGen.getSeqid()+" "+seqGen.getCounter());
        System.out.println("Exited from - "+Thread.currentThread().getName());
    }
}

class SequenceGenerator{
    public static int counter;
    public int seqid;
    public synchronized void increment(){
        synchronized (this){
            seqid +=1;
            counter+=1;
        }
        System.out.println("Incremented...");
    }

    public void decrement(){
        synchronized (this){
            seqid -=1;
            counter-=1;
        }
        System.out.println("Decremented...");
    }

    public int getSeqid() {
        return seqid;
    }

    public static int getCounter() {
        return counter;
    }
}
