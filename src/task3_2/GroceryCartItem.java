package task3_2;

public class GroceryCartItem extends GroceryItem {
    float price;
    float quantity;
    GroceryCartItem(String Name,int PricePerKg){
        super(Name, PricePerKg);

    }
    @Override
    public String toString(){
        return String.format("%s(Rs.%d * %.2fKg)=Rs.%d");
    }
    public static float extractQuantity(String quantityStr){
        String[] weightInString = quantityStr.split(" ");
        int[] weightInInteger = {Integer.parseInt(weightInString[0].replace("kg","")),Integer.parseInt(weightInString[1].replace("g",""))};
        double f = weightInInteger[0]+weightInInteger[1]*Math.pow(10,-3);
        return (float) f;
    }
    public static GroceryCartItem createNew(GroceryItem item,String quantitystr){
        GroceryCartItem gci = new GroceryCartItem(item.getName(), item.getPricePerKg());
        gci.quantity = GroceryCartItem.extractQuantity(quantitystr);
        gci.price = gci.quantity * gci.getPricePerKg();
        return gci;

    }
}
