package Instruments;

public abstract class Instrument implements IPlay, ISell {
    private String type;
    private String material;
    private int buyPrice;
    private int sellPrice;

    public Instrument(String type, String material, int buyPrice, int sellPrice){
        this.type = type;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice; }

    public double markUp() {
        return sellPrice - buyPrice;
    }

    public String play(String sound) {
        return "I make a " + sound;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

}
