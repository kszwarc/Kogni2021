package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Part6 {
    public static void main(String[] args) {
        /// Zadanie 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość w złotówkach");
        double pln = scanner.nextDouble();
        BigDecimal plnInBigDecimal = new BigDecimal(pln);
        final BigDecimal RATE = new BigDecimal("0.22");
        BigDecimal eur = RATE.multiply(plnInBigDecimal);
        System.out.println("Wynik: " + eur);
        /// Zadanie 2
    }
}
