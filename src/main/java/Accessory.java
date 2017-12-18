import Instruments.ISell;

public class Accessory implements ISell{
    private String description;
    private int buyPrice;
    private int sellPrice;

    public Accessory(String description, int buyPrice, int sellPrice){
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double markUp() {
        return sellPrice - buyPrice;
    }
}
