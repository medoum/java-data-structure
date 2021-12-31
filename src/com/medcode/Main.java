package com.medcode;

import com.medcode.model.Product;

public class Main {

    public Main() {
        super();
    }

    public static void main(String[] args) {

        System.out.println("Hello world");

        Product product = new Product("Mohamed");

        System.out.println(product.getName());

    }

    }
