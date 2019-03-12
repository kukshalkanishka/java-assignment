package com.step.uno_card_and_duplicate_card;

public class IdentityCard implements Duplicable<DuplicateIdentityCard>{
    private String name;
    private String companyName;
    private long id;

    public IdentityCard(String name, String companyName, long id) {
        this.name = name;
        this.companyName = companyName;
        this.id = id;
    }

    @Override
    public DuplicateIdentityCard duplicate() {
        return new DuplicateIdentityCard(this.name, this.companyName, this.id);
    }
}
