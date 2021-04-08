package com.streamliners.task3_1;

public class SpecialProduct extends Product {
    int regularPrice;
    int percentageOff;
    private SpecialProduct(String name, int price){
        super(name, price);
    }

    public static SpecialProduct applyOffOnProduct(Product product, int percentageOff){
        int discountPrice = product.getPrice()- product.getPrice()*percentageOff/100;
        SpecialProduct sp = new SpecialProduct(product.getName(), discountPrice);
        sp.regularPrice=product.getPrice();
        sp.percentageOff=percentageOff;
        return sp;
    }
    @Override
    public String toString() {
        return String.format("Name : %s @ Rs. %d,Regular Price : Rs. %d with Percentage off : %d",regularPrice,percentageOff,this.getName(),this.getPrice());
    }
}
