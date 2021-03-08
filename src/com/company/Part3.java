package com.company;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        /// Zadanie 1 i 2 - żeby otrzymać w wyniku liczbę zmiennoprzecinkową licznik lub mianownik również musi być takiego typu
        final double NUMBER_OF_NUMBERS = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę całkowitą");
        int numberOne = scanner.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą");
        int numberTwo = scanner.nextInt();
        double avg = (numberOne + numberTwo) / NUMBER_OF_NUMBERS;
        System.out.println(avg);
        /// Zadanie 3
        /// byte byteVar = 128; - nie da się, ponieważ 128 wykracza poza zakres
        /// Zadanie 4
        byte byteVar = 127;
        byteVar++;
        System.out.println(byteVar); /// zaczynamy od najmniejszej wartości po przekroczeniu dopuszczalnych
        /// Zadanie 5
        double one = 1;
        System.out.println(one / 0);
        /// Zadanie 6
        one = 0;
        System.out.println(one / 0);
        /// Zadanie 7
        int oneInt = 1;
        System.out.println(oneInt / 0);
    }
}
