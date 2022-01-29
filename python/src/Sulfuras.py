from src.Item import Item
from src.updateable import updateable
class Sulfuras(Item, updateable):

    def __init__(self, name , sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality
    
    def getSell_in(self):
        return self.sell_in
    
    def getQuality(self):
        return self.quality

    def updateQuality(self):
        pass
    

