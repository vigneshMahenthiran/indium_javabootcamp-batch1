package com.labs.java.io;

import java.util.Collection;
import com.labs.java.io.Product;

public class ImportExportApp {
    //import product
    //print product details
    //export product
//    ProductService service = new ProductServiceImple();


    public static void main(String[] args) {
        ProductService service = new ProductServiceImple();
        service.importProduct();

        Collection products = service.getProducts();
        for(Object product : products) {
            System.out.println(product.toString());
        }
//        System.out.println(products);

        service.exportProduct();

    }
}
