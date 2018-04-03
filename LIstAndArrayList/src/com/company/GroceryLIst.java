package com.company;

import java.util.ArrayList;

public class GroceryLIst {
    private int[] myNumbers;
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position,newItem);
        }
    }
    private void modifyGroceryItem(int index, String newItem) {
        groceryList.set(index,newItem);
        System.out.println("Grocery Item " + (index + 1) + " has been modified." );
    }

    private void removeGroceryItem(int index) {
        String theItem = groceryList.get(index);
        groceryList.remove(index - 1);
        System.out.println(theItem + " has been removed, at position " + index);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            groceryList.remove(position);
        }
    }

    private int findItem(String searchItem) {
        //boolean exsists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile (String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }
}
