package com.company;

public class Converter {
    public Command convertInputToCommand(String s[]){
        Command command = new Command();
        if(s[0].equals("T")){
            command.setDrinkType(DrinkType.TEA);
        } else if(s[0].equals("C")) {
            command.setDrinkType(DrinkType.COFFEE);
        } else {
            System.out.println("Enter coffee or tea");
        }
        if(s[1].equals("0")) {
            command.setSugar(Sugar.NONE);
        } else if (s[1].equals("1")) {
            command.setSugar(Sugar.ONE);
        } else if (s[1].equals("2")) {
            command.setSugar(Sugar.TWO);
        } else {
            System.out.println("Enter sugar quantity in range 0 - 2");
        }
        return command;
    }
}
