package com.labs.java.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ProductStats {
    public static void main(String[] args) {


        Product product1 = new Product(1,"galaxy s13","mobiles","samsung",10000);
        Product product2 = new Product(2,"iphone 15","mobiles","samsung",20000);
        Product product3 = new Product(3,"inspiron","laptops","dell",70000);
        Product product4 = new Product(4,"oled 15","smartTv","LG",25000);

//        List<Product> products = new ArrayList<>();
        List<Product> products = List.of(product1,product2,product3,product4);
//        products.add(product1);
//        products.add(product2);
//        products.add(product3);
//        products.add(product4);


        // no of products grater than 20000
        long count=products.stream()
                .filter(p -> p.getPrice()>20000)
                .count();
        System.out.println("no.of produts price grater than 20000: "+count);

        // no of product wise category

        Map<String,Long> countByCategory = products.stream()
                .collect(Collectors.groupingBy(Product :: getCategory , Collectors.counting()));
        System.out.println(countByCategory);

        // list of products ids of laptops

        List<Integer> productsIds = products.stream()
                .filter(p -> p.getCategory()=="laptops")
                .map(p -> p.getId())
                .collect(Collectors.toList());

        System.out.println("ids of products categore as laptops "+productsIds);

        // total sum of product price , minimum price, maximum price , average price

        DoubleSummaryStatistics stats =  products.stream()
                .map(p -> p.getPrice())
                .mapToDouble(x->x)
                .summaryStatistics();
        System.out.println("sum of all products price "+stats.getSum());
        System.out.println("minimum product price "+stats.getMin());
        System.out.println("maximum product price "+stats.getMax());
        System.out.println("avg product price "+stats.getAverage());
    }
}
