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
        /// System.out.println(oneInt / 0); - błąd
        /// Zadanie 8
        final double EUR_RATE = 0.22;
        final double USD_RATE = 0.26;
        System.out.println("Wprowadź kwotę w PLN");
        double pln = scanner.nextDouble();
        System.out.println("Podałeś kwotę w PLN " + pln);
        System.out.println("Jej wartość w EUR to " + pln * EUR_RATE);
        System.out.println("Jej wartość w USD to " + pln * USD_RATE);
        /// Wartości pieniężnych nie powinniśmy zapisywać za pomocą typów zmiennoprzecinkowych
        /// Zadanie 9
        System.out.println("Podaj moc N");
        double N = scanner.nextDouble();
        System.out.println("Podaj prędkość obrotową ns");
        double ns = scanner.nextDouble();
        double M = 9550 * N / ns;
        System.out.println("Moment obrotowy wynosi " + M);
        /// Zadanie 10
        float floatVar = 100000001;
        float floatVar2 = 100000000;
        System.out.println("Różnica wartości między zmiennymi to: " + (floatVar - floatVar2));
        /// Zadanie 11
        System.out.println("Wprowadź liczbę całkowitą");
        int intVar = scanner.nextInt();
        System.out.println("Reszta modulo 1: " + (intVar % 1));
        System.out.println("Reszta modulo 2: " + (intVar % 2));
        /// Zadanie 12
        System.out.println("Wprowadź liczbę zmiennoprzecinkową");
        double doubleVar = scanner.nextDouble();
        System.out.println("Reszta modulo 1: " + (doubleVar % 1));
        System.out.println("Reszta modulo 2: " + (doubleVar % 2));
        /// Zadanie 13
        System.out.println("Podaj pierwszą liczbę całkowitą");
        int numberOneFromUser = scanner.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą");
        int numberTwoFromUser = scanner.nextInt();
        System.out.println("Liczba pierwsza większa od drugiej: " + (numberOneFromUser > numberTwoFromUser));
        /// Zadanie 14
        System.out.println("Podaj pierwszą liczbę całkowitą");
        int numberOneEx14 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą");
        int numberTwoEx14 = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę całkowitą");
        int numberThreeEx14 = scanner.nextInt();
        boolean numberOneIsTheBiggest = (numberOneEx14 > numberTwoEx14) && (numberOneEx14 > numberThreeEx14);
        System.out.println("Liczba pierwsza jest największa: " + numberOneIsTheBiggest);
        /// Zadanie 15
        double doubleVarEx15 = scanner.nextDouble();
        if (doubleVarEx15 < 50 ) {
            System.out.println("Wpisana liczba jest mniejsza od 50");
        }
        else {
            System.out.println("Wpisana liczba jest większa bądź równa 50");
        }
    }
}
