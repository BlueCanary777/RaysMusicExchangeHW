import Instruments.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public int countItemsInStock(){
        return this.stock.size();
    }


}
