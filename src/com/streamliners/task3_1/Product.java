package com.streamliners.task3_1;

public class Product {
    private String name;
    private int price;
    Product(){

    }

    public Product(String name,int price) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return String.format("Name : %s @ Rs. %d",name,price);
    }
    @Override
    public boolean equals(Object obj1){
        Product p =  (Product)obj1;
        return this.name.equals(p.getName());
    }
}
