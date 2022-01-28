import pytest

def test_gilded_rose():
    items = [
             NormalItem(name="+5 Dexterity Vest", sell_in=10, quality=20),
             AgedBrie(name="Aged Brie", sell_in=2, quality=0),
             NormalItem(name="Elixir of the Mongoose", sell_in=5, quality=7),
             Sulfuras(name="Sulfuras, Hand of Ragnaros", sell_in=0, quality=80),
             Sulfuras(name="Sulfuras, Hand of Ragnaros", sell_in=-1, quality=80),
             Backstage(name="Backstage passes to a TAFKAL80ETC concert", sell_in=15, quality=20),
             Backstage(name="Backstage passes to a TAFKAL80ETC concert", sell_in=10, quality=49),
             Backstage(name="Backstage passes to a TAFKAL80ETC concert", sell_in=5, quality=49),
             Conjured(name="Conjured Mana Cake", sell_in=3, quality=6),
            ]

    days = 2
    import sys
    if len(sys.argv) > 1:
        days = int(sys.argv[1]) + 1
    for day in range(days):
        print("-------- day %s --------" % day)
        print("name, sellIn, quality")
        for item in items:
            print(item)
        print("")
        GildedRose(items).update_quality()