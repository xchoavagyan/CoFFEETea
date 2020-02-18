package com.company;

public class CoffeeMachine {

    public void makeDrink(Command command) {
        System.out.println(command.getDrinkType() + " " + command.getSugar());
    }


}
