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
        System.out.println("Średnia " + avg);
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
            if (i % 4 == 0 && i % 16 != 0) {
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
        /// Zadanie 6 - ograniczamy tylko dla potęgi należącej do zbioru liczb naturalnych
        System.out.println("Wprowadź p");
        int p = scanner.nextInt();
        System.out.println("Wprowadź n");
        int n_6 = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < n_6; i++) {
            result *= p;
        }
        System.out.println(result);
        /// Zadanie 7 - najlepiej je rozwiązać rysując sobie choinkę ręcznie i obserwując zależności, które są użyte w pętli
        System.out.println("Wprowadź wysokość");
        int height = scanner.nextInt();
        final char TREE_SYMBOL = '*';
        int numberOfSpaces = height;
        int numberOfSymbols = 1;
        for (int i = 0; i < height; i++) {
            /// W jednym obiegu pętli wypiszemy jedną linię choinki. Najpierw spacje przesuwające *
            for (int j = 0; j < numberOfSpaces; j++) {
                System.out.print(" ");
            }
            /// A teraz *
            for (int j = 0; j < numberOfSymbols; j++) {
                System.out.print(TREE_SYMBOL);
            }
            System.out.println(); /// przechodzimy do kolejnej linii choinki
            numberOfSpaces--; /// z obserwacji rysowania choinki wiemy, że z każdą linijką mamy o jedną spację mniej i o dwa symbole więcej
            numberOfSymbols += 2;
        }
        /// rysujemy dół
        final int BOTTOM_HEIGHT = height / 2 == 0 ? 1 : height / 2; /// założyłem, że ładnie będzie wyglądała choinka jeżeli dół będzie miał połowę wysokości. Jeżeli połowa to 0 (np. dla wysokości 1), to wpisujemy 1, żeby jakiś dół był
        final char BOTTOM_SYMBOL = '|';
        for (int i = 0; i < BOTTOM_HEIGHT; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(" ");
            }
            System.out.println(BOTTOM_SYMBOL);
        }
        /// Zadanie 8
        System.out.println("Wprowadź liczbę, dla której mam wyznaczyć dzielniki");
        int number_8 = scanner.nextInt();
        System.out.println("Dzielniki liczby " + number_8 + " to: ");
        for (int i = 1; i <= number_8; i++) {
            if (number_8 % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
