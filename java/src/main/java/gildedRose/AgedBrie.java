package gildedRose;

public class AgedBrie extends Item implements updateable {

	AgedBrie(String name, int sell_in, int quality) {
		super(name, sell_in, quality);
	}

	public void updateQuality() {
		if (getSell_in() <= 0) {
			setQuality(getQuality() + 2);
		} else {
			setQuality(getQuality() + 1);
		}
		checkQuality();
		setSell_in();
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