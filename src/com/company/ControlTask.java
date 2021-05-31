package com.company;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class ControlTask {
    public static void main(String[] args) {
        System.out.println("Wybierz jedną z dostępnych opcji");
        System.out.println("1 - statystyki wprowadzonych liczb");
        System.out.println("2 - losowanie");
        System.out.println("3 - konwerter");
        Scanner reader = new Scanner(System.in);
        int choice = Integer.parseInt(reader.nextLine());
        switch (choice) {
            case 1:
                int sum = 0;
                int counter = 0;
                int minNumber = Integer.MAX_VALUE;
                int maxNumber = Integer.MIN_VALUE;
                System.out.println("Podaj liczbę (0 kończy)");
                int userNumber = Integer.parseInt(reader.nextLine());
                while (userNumber != 0) {
                    sum += userNumber;
                    if (userNumber > maxNumber) {
                        maxNumber = userNumber;
                    }
                    if (userNumber < minNumber) {
                        minNumber = userNumber;
                    }
                    counter++;
                    System.out.println("Podaj liczbę (0 kończy)");
                    userNumber = Integer.parseInt(reader.nextLine());
                }
                double avg = sum / (double) counter;
                int factorial = maxNumber;
                for (int i = 2; i < maxNumber; i++) {
                    factorial *= i;
                }
                System.out.println("Największa wartość " + maxNumber);
                System.out.println("Najmniejsza wartość " + minNumber);
                System.out.println("Srednia wartość " + avg);
                System.out.println("Silnia największej wartości " + factorial);
                break;
            case 2:
                System.out.println("Podaj dolny zakres losowania");
                int lowerRange = Integer.parseInt(reader.nextLine());
                System.out.println("Podaj górny zakres losowania");
                int upperRange = Integer.parseInt(reader.nextLine());
                if (lowerRange > upperRange) {
                    int tmp = lowerRange;
                    lowerRange = upperRange;
                    upperRange = tmp;
                }
                Random generator = new Random();
                int drawn = generator.nextInt(upperRange - lowerRange + 1) + lowerRange;
                System.out.println("Dzielniki liczby " + drawn +":");
                for (int i = 1; i <= drawn; i++) {
                    if (drawn % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 3:
                System.out.println("Wybierz jedną z dostępnych opcji");
                System.out.println("1 - złotówki na dolary");
                System.out.println("2 - złotówki na euro");
                int choiceConverter = Integer.parseInt(reader.nextLine());
                while (choiceConverter != 1 && choiceConverter != 2) {
                    System.out.println("Wybrałeś niepoprawną wartość. Do wyboru masz:");
                    System.out.println("1 - złotówki na dolary");
                    System.out.println("2 - złotówki na euro");
                    choiceConverter = Integer.parseInt(reader.nextLine());
                }
                System.out.println("Wprowadź wartość do przeliczenia");
                BigDecimal amount = reader.nextBigDecimal();
                final BigDecimal RATE;
                if (choiceConverter == 1) {
                    RATE = new BigDecimal("0.26");
                } else {
                    RATE = new BigDecimal("0.22");
                }
                System.out.println("Przeliczona wartość: " + amount.multiply(RATE));
                break;
            default:
                System.out.println("Wybrałeś złą opcję");
                break;
        }
    }
}
