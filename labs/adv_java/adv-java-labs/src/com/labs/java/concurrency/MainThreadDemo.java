package com.labs.java.concurrency;

public class MainThreadDemo {
    public static void main(String[] args) {
        System.out.println("hello java thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getState().name());
        System.out.println("sleeping");
        try{
            Thread.sleep(5*60*1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("execution completed");
    }
}
