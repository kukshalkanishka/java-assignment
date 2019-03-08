package com.step.jwelleryAssignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelryBoxTest {

    @Test
    void getJewelryCount() {
        JewelryBox smallestJewelryBox = new JewelryBox();
        Jewelry jewelryInBiggest = new Jewelry("gold");
        JewelryBox smallerJewelryBox = new JewelryBox(jewelryInBiggest, smallestJewelryBox);
        JewelryBox biggestBox= new JewelryBox(jewelryInBiggest, smallerJewelryBox);
        assertEquals(2, biggestBox.getJewelryCount());
    }

    void name() {
        JewelryBox _5thLevelBox = new JewelryBox();

        JewelryBox _4thLevelBox = new JewelryBox(_5thLevelBox);

        Jewelry nacklace = new Jewelry("necklace");
        JewelryBox _3rdLevelBox = new JewelryBox(nacklace, _4thLevelBox);

        Jewelry ring = new Jewelry("ring");
        JewelryBox _2ndLevelBox = new JewelryBox(ring, _3rdLevelBox);

        JewelryBox _1stLevelBox = new JewelryBox(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.getJewelryCount());
    }
}