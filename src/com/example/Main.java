package com.example;

public class Main {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("I am scared of aliens");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("you have the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater than second top score and less than 100");
        }
        if ((topScore<90)|| (secondTopScore <=90))
            System.out.println("Either of both are true");

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }
}
