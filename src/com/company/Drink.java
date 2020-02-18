package com.company;

public class Drink {
    private String typeOfDrink;
    private int sugarQuantity;

    public Drink(String typeOfDrink, int sugarQuantity) {
        this.typeOfDrink = typeOfDrink;
        this.sugarQuantity = sugarQuantity;
    }

    public Drink() {
    }

    public String getTypeOfDrink() {
        return typeOfDrink;
    }

    public void setTypeOfDrink(String typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
    }

    public int getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(int sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }
}
