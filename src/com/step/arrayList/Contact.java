package com.step.arrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void printGroceryList(){
        System.out.println(this.groceryList);
    }

    public void modifyItem(int position, String newItem){
        groceryList.set(position, newItem);
    }

    public void addItems(String item){
        groceryList.add(item);
    }
}

