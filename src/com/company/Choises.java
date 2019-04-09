package com.company;

import java.util.Scanner;

public class Choises {
    int number;
    Scanner s2 = new Scanner(System.in);
    Actions ac = new Actions();
    Instructions in = new Instructions();

    public void Choise(){
        while(number != 4) {
            in.printInstructions();
            number = s2.nextInt();

            switch (number) {
                case 1:
                    ac.addCountry()
                    ;
                    break;
                case 2:
                    ac.print();
                    break;
                case 3:
                    ac.remove();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("invalid input");
            }
        }
    }
}
