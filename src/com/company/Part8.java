package com.company;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part8 {
    public static void main(String[] args) {
        /// Zadanie 1
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj system liczbowy na jaki mamy zamienić liczbę");
        byte system = Byte.valueOf(reader.nextLine());
        converter(system);
        /// Zadanie 2
        boolean result = isLowerThan100AndInteger();
        System.out.println(result);
        System.out.println(isLowerThan100AndInteger());
        /// Zadanie 3
        returnDouble();
        /// Zadanie 4
        System.out.println("Wprowadź kwotę");
        BigDecimal amount = reader.nextBigDecimal();
        BigDecimal resultEx4 = new BigDecimal("0");
        System.out.println("Wybierz euro (1) lub dolary (2)");
        int option = reader.nextInt();
        if (option == 1) {
            resultEx4 = calculateValueInEuro(amount);
        } else if (option == 2) {
            resultEx4 = calculateValueInDollar(amount);
        }
        System.out.println("Dla wprowadzonej kwoty " + amount + " wynik to: " + resultEx4);
        /// Zadanie 5
        System.out.println("Podaj wymiar tablicy");
        int dimension = reader.nextInt();
        int[] generatedArray = generateArray(dimension);
        System.out.println(Arrays.toString(generatedArray));
        /// Zadanie 6
        int[] arrayByReference = new int[dimension];
        System.out.println(Arrays.toString(arrayByReference));
        generateArrayByReference(arrayByReference);
        System.out.println(Arrays.toString(arrayByReference));
    }

    public static void generateArrayByReference(int[] array) {
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(15);
        }
    }

    public static int[] generateArray(int dimension) {
        int[] array = new int[dimension];
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(15);
        }
        return array;
    }

    public static BigDecimal calculateValueInDollar(BigDecimal amount) {
        final BigDecimal USD_RATE = new BigDecimal("0.27");
        return USD_RATE.multiply(amount);
    }

    public static BigDecimal calculateValueInEuro(BigDecimal amount) {
        final BigDecimal EUR_RATE = new BigDecimal("0.22");
        return EUR_RATE.multiply(amount);
    }

    public static double returnDouble() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Wprowadź double");
        while (!reader.hasNextDouble()) {
            reader.nextLine();
            System.out.println("Wprowadź double!");
        }
        return reader.nextDouble();
    }

    public static boolean isLowerThan100AndInteger() {
        System.out.println("Wprowadź liczbę typu int mniejszą od 100");
        Scanner reader = new Scanner(System.in);
        if (reader.hasNextInt()) {
            int number = reader.nextInt();
            if (number < 100) {
                return true;
            }
        }
        return false;
    }

    public static void converter(byte system) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj liczbę jaką przekonwertować");
        double digit = Double.valueOf(reader.nextLine());
        StringBuilder result = new StringBuilder("");
        int integer = (int) digit;
        double fraction = digit - integer; /// digit % 1
        do {
            result.append(integer % system);
            integer /= system; /// integer = integer / system;
        } while (integer != 0);
        result.reverse();
        result.append(",");
        final byte MAX_REDUCT = 7;
        byte actualReduct = 0;
        do {
            fraction *= system;
            result.append((int) fraction);
            fraction %= 1;
            actualReduct++;
        } while (fraction != 0 && actualReduct < MAX_REDUCT);
        System.out.println("Liczba " + digit + " w systemie " + system + " wynosi " + result);
    }
}
