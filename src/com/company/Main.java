package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(":");
        Converter converter = new Converter();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeDrink(converter.convertInputToCommand(s));
//        try{
//            coffeeMachine.makeDrink(converter.convertInputToCommand(s));
//        }catch (IndexOutOfBoundsException ex){
//            System.out.println("aaaaa");
//        }


    }
}
