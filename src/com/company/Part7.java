package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        /// Zadanie 1
        double[] tab = new double[20];
        double sum = 0;
        double min = 0;
        double max = 0;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextDouble();
            sum += tab[i];
            if (i == 0) {
                min = tab[i];
                max = tab[i];
            } else if (min > tab[i]) {
                min = tab[i];
            } else if (max < tab[i]) {
                max = tab[i];
            }
        }
        System.out.println("Średnia: " + sum / tab.length);
        System.out.println("Minimalna: " + min);
        System.out.println("Maksymalna: " + max);
        /// Zadanie 2
        System.out.println("Podaj system liczbowy na jaki mamy zamienić liczbę");
        byte system = Byte.valueOf(reader.nextLine());
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
        /// Zadanie 3
        System.out.println("Podaj linijkę tekstu");
        String line = reader.nextLine();
        StringBuilder shiftedResult = new StringBuilder();
        final byte OFFSET = 13;
        for (int i = 0; i < line.length(); i++) {
            int numericNewChar = line.charAt(i) + OFFSET;
            shiftedResult.append((char) numericNewChar);
        }
        System.out.println("Przesunięty tekst: " + shiftedResult);
        /// Zadanie 4
        int[] tabEx4 = new int[20];
        for (int i = 0; i < tabEx4.length; i++) {
            tabEx4[i] = random.nextInt(11);
        }
        Arrays.sort(tabEx4);
        System.out.println(Arrays.toString(tabEx4));
        /// Zadanie 5
        int[] example = {2, 5, 7, 34};
        int[] destination = new int[example.length];
        for (int i = 0; i < example.length; i++) {
            destination[i] = example[i];
        }
        System.arraycopy(example, 0, destination, 0, example.length);
        /// Zadanie 6
        System.out.println("Podaj linijkę");
        String lineEx6 = reader.nextLine();
        String[] splitResult = lineEx6.split(" ");
        int[] intResult = new int[splitResult.length];
        int sumEx6 = 0;
        for (int i = 0; i < splitResult.length; i++) {
           intResult[i] = Integer.valueOf(splitResult[i]);
           sumEx6 += intResult[i];
        }
        System.out.println("Suma " + sumEx6);

    }
}
