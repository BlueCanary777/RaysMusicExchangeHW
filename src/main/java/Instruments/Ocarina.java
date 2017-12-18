package Instruments;

import Instruments.Instrument;

public class Ocarina extends Instrument implements IPlay {
    private int numHoles;
    private int buyPrice;
    private int sellPrice;

    public Ocarina(int numHoles, int buyPrice, int sellPrice, String type, String material){
        super( type, material, buyPrice, sellPrice);
        this.numHoles = numHoles;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getNumHoles() {
        return numHoles;
    }

    @Override
    public int getBuyPrice() {
        return buyPrice;
    }

    @Override
    public int getSellPrice() {
        return sellPrice;
    }

    public String play() {
        return "Peep";
    }

}
