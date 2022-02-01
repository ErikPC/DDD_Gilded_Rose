package edu.poniperro.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private List<Updateable> stock = new ArrayList<Updateable>();

    GildedRose() {
    }

    public void addItem(Updateable item) {
        stock.add(item);
    }

    public List<Updateable> inventory() {
        return stock;
    }

    public void updateQuality() {
        for (int i = 0; i < stock.size(); i++) {
            stock.get(i).updateQuality();
        }
    }

}
