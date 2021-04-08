package task3_2;


public class GroceryItem {
    String Name;
    int PricePerKg;
    GroceryItem(String Name,int PricePerKg){
        this.Name=Name;
        this.PricePerKg=PricePerKg;
    }
    public String getName(){
        return Name;
    }
    public int getPricePerKg(){
        return PricePerKg;
    }

}
