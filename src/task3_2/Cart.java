package task3_2;

import java.util.ArrayList;

public class Cart {
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;
    Cart(){
        cartItems = new ArrayList<>();
        totalAmount = 0;
    }
    public Cart add(GroceryCartItem item){
        cartItems.add(item);
        return this;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cart{" +"\n\tGroceryCartItems={");
        for(GroceryCartItem gci :cartItems){
            sb.append("\n\t\t"+ gci.toString()+",");
        }
        sb.append("\b\n\t],"+ "\ntotalAmount = Rs."+ this.totalAmount + "}");
        return sb.toString();
    }
}
