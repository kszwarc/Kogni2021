package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Part6 {
    public static void main(String[] args) {
        /// Zadanie 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość w złotówkach");
        double PLN = scanner.nextDouble();
        BigDecimal PLN_BD = new BigDecimal(PLN);
        BigDecimal RATE = new BigDecimal("0.22");
        BigDecimal EUR = RATE.multiply(PLN_BD);
        System.out.println("Wynik: " + EUR);
        /// Zadanie 2
    }
}
