package com.company;

public class Command {
    private DrinkType drinkType;
    private Sugar sugar;

    public Command(DrinkType drinkType, Sugar sugar) {
        this.drinkType = drinkType;
        this.sugar = sugar;
    }

    public Command() {
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }
}
