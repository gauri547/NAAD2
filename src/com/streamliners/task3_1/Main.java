package com.streamliners.task3_1;
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Apple", 78);
        Product p2 = new Product("Apple", 78);
        Product p3 = new Product("Orange", 50);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        if (p1.equals(p2)) {
            System.out.println("Two products are equal");
        }
        SpecialProduct sp = SpecialProduct.applyOffOnProduct(p1, 70);
        System.out.println(sp.toString());
    }
}
