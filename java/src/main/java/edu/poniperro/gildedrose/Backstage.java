package edu.poniperro.gildedrose;

public class Backstage extends Item implements Updateable {

    public Backstage(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        if (getSell_in() > 10) {
            setQuality(getQuality() + 1);
        } else if (getSell_in() <= 5) {
            setQuality(getQuality() + 3);
        } else {
            setQuality(getQuality() + 2);
        }
        if (getSell_in() <= 0) {
            setQuality(0);
        }
        setSell_in();
        checkQuality();
    }

    private void checkQuality() {
        if (getQuality() >= 50) {
            setQuality(50);
        }
        if (getQuality() <= 0) {
            setQuality(0);
        }
    }
}
