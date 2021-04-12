package com.company;

import java.util.Random;
import java.util.Scanner;

public class Part5 {
    public static void main(String[] args) {
        /// Zadanie 1
        double number = 9.997;
        int numberInt = (int) number;
        System.out.println(numberInt);
        /// Zadanie 2
        System.out.println((int) number);
        /// Zadanie 3
        System.out.println((char) 100);
        /// Zadanie 4
        Scanner scanner = new Scanner(System.in);
        int minValue = scanner.nextInt();
        int maxValue = scanner.nextInt();
        Random generator = new Random();
        final byte REPETITIONS = 5;
        for (int i = 0; i < REPETITIONS; i++) {
            int drawn = minValue + generator.nextInt(maxValue + 1 - minValue);
            System.out.println(drawn);
        }
        /// Zadanie 5
        int minValueEx5 = scanner.nextInt();
        int maxValueEx5 = scanner.nextInt();
        int drawn = minValueEx5 + generator.nextInt(maxValueEx5 + 1 - minValueEx5);
        int userNumber = scanner.nextInt();
        while (userNumber != drawn) {
            if (userNumber > drawn) {
                System.out.println("Za duża liczba");
            } else {
                System.out.println("Za mała liczba");
            }
            userNumber = scanner.nextInt();
        }
        System.out.println("Odgadłeś liczbę");
    }
}
