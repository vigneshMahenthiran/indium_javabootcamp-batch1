package com.labs.java.timeline;

import java.util.*;

public class DateDemo {
    public static void main(String[] args) {
        Date currentDateTime = new Date();
        System.out.println(currentDateTime);

        Date lastMonthDate = new Date("2023/08/21 16:10:10");
        System.out.println(lastMonthDate);

        Calendar now = Calendar.getInstance();
        System.out.println(now.getTime());
        System.out.println(now.getTimeInMillis());
        long start = System.currentTimeMillis();
        for(int i=0 ;i<1000;i++){
            int j=1;
        }
        long end = System.currentTimeMillis();
        System.out.println(start-end);
    }
}
