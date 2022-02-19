package edu.poniperro;

import edu.poniperro.gildedrose.AgedBrie;
import edu.poniperro.gildedrose.Backstage;
import edu.poniperro.gildedrose.Conjured;
import edu.poniperro.gildedrose.Item;
import edu.poniperro.gildedrose.NormalItem;
import edu.poniperro.gildedrose.Sulfuras;
import edu.poniperro.gildedrose.Updateable;

public class App {
    public static void main(String[] args) {
        Updateable[] items = new Updateable[] {
                new NormalItem("+5 Dexterity Vest", 10, 20), //
                new AgedBrie("Aged Brie", 2, 0), //
                new NormalItem("Elixir of the Mongoose", 5, 7), //
                new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
                new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Backstage("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Conjured("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Updateable item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}