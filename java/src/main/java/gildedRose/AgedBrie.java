package gildedRose;

public class AgedBrie {

	private final String name;
	private int sell_in;
	private int quality;

	public AgedBrie(String name, int Sell_in, int quality) {
		this.name = name;
		this.sell_in = Sell_in;
		this.quality = quality;
	}

	public String getName() {
		return this.name;
	}

	public int getSell_in() {
		return this.sell_in;
	}

	public int getQuality() {
		return this.quality;
	}

	public void updateQuality() {

		checkQuality();
	}

	private void checkQuality() {
		if (this.quality >= 50) {
			this.quality = 50;
		}
		if (this.quality <= 0) {
			this.quality = 0;
		}
	}
}