package com.company;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int select = main(in);
        switch (select) {
            case 1:
                ChiefFactory cooking = new SpicydishesFactory();
                Chicken wings = cooking.cookTastyChiken();
                wings.description();
                Sandwich zinger = cooking.cookTastySanwich();
                zinger.description();
                break;
            case 2:
                cooking = new NotSpicyFactory();
                Chicken strips = cooking.cookTastyChiken();
                strips.description();
                Sandwich classic = cooking.cookTastySanwich();
                classic.description();
                break;
        }
    }

    public static int main(Scanner in) {
        System.out.println("Добро пожаловать в KFC! Что хотите заказать?");
        System.out.println( "1.Острое комбо\n" +
                            "2.Не острое комбо");
        int selection = in.nextInt();
        return selection;
    }
}


