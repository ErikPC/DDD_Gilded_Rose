from src.Item import Item
from src.updateable import updateable

class Backstage(Item, updateable):

    def __init__(self, name, sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality

    def getSell_in(self):
        return self.sell_in
    
    def getQuality(self):
        return self.quality
    
    def updateQuality(self):
        if self.sell_in > 10:
            self.quality += 1
        elif self.sell_in <= 5:
            self.quality += 3
        else:
             self.quality += 2
        if self.sell_in <= 0:
            self.quality = 0
        self.maxQuality()
        self.sell_in -= 1

    def maxQuality(self):
        if self.quality >= 50:
            self.quality = 50
