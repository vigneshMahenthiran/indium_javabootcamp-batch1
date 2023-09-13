package com.labs.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class ProductServiceImple implements ProductService{

    private Map<Integer, Product> products = new HashMap<>();
    @Override
    public void importProduct() {
        try(BufferedReader reader = new BufferedReader(new FileReader("./input/product-input.txt"))){
            String line;
            while((line = reader.readLine() )!= null){
                System.out.println(line);
                String[] parts = line.split(",");
                int productId = Integer.parseInt(parts[0].trim());
                String brand = parts[1];
                String product = parts[2];
                double price = Double.parseDouble(parts[3]);
                Product newProduct = new Product(productId,brand,product, price ,brand);
                products.put(productId,newProduct);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void exportProduct() {
        int counter = 0;
        try(PrintWriter out = new PrintWriter(new FileWriter("./output/product-output.txt"))){
            for(Product product : products.values()){
                StringBuilder productRec = new StringBuilder();
                productRec.append(product.getId())
                        .append(",")
                        .append(product.getCategory())
                        .append(",")
                        .append(product.getName())
                        .append(",")
                        .append(product.getPrice())
                        .append("\n");
                out.write(productRec.toString());
                counter++;
            }
            System.out.println("products exported "+counter);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public Collection getProducts() {
        return products.values();
    }
}
