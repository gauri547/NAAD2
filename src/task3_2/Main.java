package task3_2;

public class Main {
    public static void main(String[] args) {
        GroceryItem sugar = new GroceryItem("Sugar",35);
        GroceryItem jaggery = new GroceryItem("Jaggery",45);
        GroceryItem orange = new GroceryItem("Orange",60);
        GroceryItem apple = new GroceryItem("Apple",120);

        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(sugar,"3kg 0g"))
            .add(GroceryCartItem.createNew(jaggery,"0kg 750g"))
            .add(GroceryCartItem.createNew(orange,"1kg 500g"))
            .add(GroceryCartItem.createNew(apple,"3kg 500g"));
        System.out.println(cart.toString());
    }
}
