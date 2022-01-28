import pytest



@pytest.mark.update_quality_brie
def test_update_quality_brie():
    cheese = AgedBrie("Aged Brie", 0, 0)
    assert -1 == cheese.getSell_in()
    assert 2 == cheese.getQuality()

@pytest.mark.update_quality_expired
def test_update_quality_expired():
    cheese = AgedBrie("Aged Brie", 0, 0)
    assert -1 == cheese.getSell_in()
    assert 2 == cheese.getQuality

@pytest.mark.max_quality
def test_max_quality():
    cheese = AgedBrie("Aged Brie", -1, 50)
    assert -2 == cheese.getSell_in()
    assert 50 == cheese.getQuality

    cheese = AgedBrie("Aged Brie", -1, 49)
    assert -2 == cheese.getSell_in()
    assert 50 == cheese.getQuality()