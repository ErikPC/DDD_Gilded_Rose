package edu.poniperro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.poniperro.gildedrose.Item;
import edu.poniperro.gildedrose.Updateable;

public class GildedRose {

    private List<Updateable> stock = new ArrayList<Updateable>();

    public GildedRose() {
    };

    public GildedRose(Updateable[] items) {
        this.stock.addAll(Arrays.asList(items));
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
