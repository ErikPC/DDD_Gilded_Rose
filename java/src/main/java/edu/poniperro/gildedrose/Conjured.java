package edu.poniperro.gildedrose;

public class Conjured extends Item implements Updateable {

    public Conjured(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        if (getSell_in() <= 0) {
            setQuality(getQuality() - 4);
        } else {
            setQuality(getQuality() - 2);
        }
        setSell_in();
        checkQuality();
    }

    private void checkQuality() {
        if (getQuality() <= 0) {
            setQuality(0);
        }
    }
}
