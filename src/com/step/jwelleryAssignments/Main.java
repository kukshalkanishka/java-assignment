package com.step.jwelleryAssignments;

public class Main {
    public static void main(String[] args) {
        Jewelry jewelry = new Jewelry("necklace");
        JewelryBox jewelryBox = new JewelryBox(jewelry);
        JewelryBox jewelryBox1 = new JewelryBox(jewelryBox);
        JewelryBox bigBox = new JewelryBox(jewelry, jewelryBox1);

        System.out.println(bigBox.getJewelryCount());
    }
}
