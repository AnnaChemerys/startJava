package com.hw;

public class ObjectAndToString {
    public static void main(String[] args) {
        Product butter = new Product("Butter", 50);
        System.out.println(butter);

    }
}

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}