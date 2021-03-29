package com.company;

import java.util.Scanner;

public class Part4 {
    public static void main (String[] args) {
        /// Zadanie 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program pobiera od użytkownika n liczb i oblicza ich średnią");
        System.out.println("Podaj liczbę n");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i=0; i<n; i++) {
            System.out.println("Podaj kolejną liczbę całkowitą");
            sum += scanner.nextInt();
        }
        double avg =  sum / n;
        System.out.println("Srednia " + avg);
        /// Zadanie 2
        final int MIN_VALUE = 1;
        final int MAX_VALUE = 100;
        final int MODULO = 3;

        System.out.println("Podzielne przez " + MODULO + ":");
        for (int counter = MIN_VALUE; counter <= MAX_VALUE; counter++) {
            if (counter % MODULO == 0) {
                System.out.println(counter);
            }
        }
        System.out.println("Podzielne przez " + MODULO + ":");
        int counter = MIN_VALUE;
        while (counter <= MAX_VALUE) {
            if (counter % MODULO == 0) {
                System.out.println(counter);
            }
            counter++;
        }
        System.out.println("Podzielne przez " + MODULO + ":");
        counter = MIN_VALUE;
        do {
            if (counter % MODULO == 0) {
                System.out.println(counter);
            }
            counter++;
        } while (counter <= MAX_VALUE);
        /// Zadanie 3

        System.out.println("Wpisz liczbę, dla której mamy obliczyć silnię");
        int number = scanner.nextInt();
        int factorial = 1;
        if (number > 1) {
            for (int i = number; i > 1; i--) {
                factorial *= i;
            }
        }
        System.out.println(factorial);
        /// Zadanie 4

        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 && i % 16 !=0) {
                continue;
            }
            System.out.println(i);
        }

        /// Zadanie 5
        System.out.println("Ile liczb chcesz wpisać?");
        int n_5 = scanner.nextInt();
        int min = 0;
        int max = 0;
        for (int i = 0; i < n_5; i++) {
            int number_5 = scanner.nextInt();
            if (i == 0) {
                min = number_5;
                max = number_5;
            }
            else if (number_5 > max) {
                max = number_5;
            }
            else if (number_5 < min) {
                min = number_5;
            }
        }
        System.out.println("min: " + min + " max: " + max);
    }
}
