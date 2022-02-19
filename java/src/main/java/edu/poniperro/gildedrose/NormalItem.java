package edu.poniperro.gildedrose;

public class NormalItem extends Item implements Updateable {

    public NormalItem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        if (getSell_in() <= 0) {
            setQuality(getQuality() - 2);
        } else {
            setQuality(getQuality() - 1);
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