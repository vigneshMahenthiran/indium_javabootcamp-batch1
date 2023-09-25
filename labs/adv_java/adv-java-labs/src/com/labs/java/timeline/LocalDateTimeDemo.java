package com.labs.java.timeline;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime afterTenDays = now.plusDays(10);
        System.out.println(afterTenDays);
        LocalDate cureentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

    }
}
