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
    }
}
