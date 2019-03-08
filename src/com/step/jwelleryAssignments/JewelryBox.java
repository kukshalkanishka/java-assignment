package com.step.jwelleryAssignments;

public class JewelryBox {
    private int jewelryCount;
    private Jewelry jewelry;
    private JewelryBox jewelryBox;

    public JewelryBox() {

    }

    public JewelryBox(Jewelry jewelry, JewelryBox jewelryBox) {
        this.jewelry = jewelry;
        if(jewelry != null) {
            this.jewelryCount += 1;
        }
        this.jewelryBox = jewelryBox;
        this.jewelryCount += jewelryBox.jewelryCount;
}

    public JewelryBox(Jewelry jewelry) {
        this(jewelry, new JewelryBox());
    }

    public JewelryBox(JewelryBox jewelryBox) {
        this(null, jewelryBox);
    }

    public int getJewelryCount() {
        return jewelryCount;
    }
}
