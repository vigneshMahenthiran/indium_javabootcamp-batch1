package com.labs.java.fp;

public class CalcMain {
    public static void main(String[] args) {
//        CalcOOP calcOOP = new CalcOOP();
//        calcOOP.a=50;
//        calcOOP.b=60;
//        System.out.println(calcOOP.add());
//        System.out.println(calcOOP.sub());
//        calcOOP.a=10;
//        calcOOP.b=5;
//        System.out.println(calcOOP.add());
//        System.out.println(calcOOP.sub());

        //functional programming implementation

        CalcFp calcFp = new CalcFp();
        System.out.println(calcFp.add(5,6));
        System.out.println(calcFp.add(7,7));
    }
}
