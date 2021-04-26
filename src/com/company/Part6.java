package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Part6 {
    public static void main(String[] args) {
        /// Zadanie 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość w złotówkach");
        double pln = scanner.nextDouble(); /// możemy też skorzystać ze scanner.nextBigDecimal() przypisując wartość bezpośrednio do plnInBigDecimal
        BigDecimal plnInBigDecimal = new BigDecimal(pln);
        final BigDecimal RATE = new BigDecimal("0.22");
        BigDecimal eur = RATE.multiply(plnInBigDecimal);
        System.out.println("Wynik: " + eur);
        /// Poznajemy Stringa
        String var = "Ala ma kota";
        String var2 = new String("ala ma kota");
        System.out.println(var.length());
        System.out.println(var.contains("msa"));
        System.out.println(var.charAt(0));
        System.out.println(var.substring(0, 5));
        System.out.println(var.toLowerCase());
        System.out.println(var.toUpperCase());
        System.out.println(var.equals(var2));
        System.out.println(var.equalsIgnoreCase(var2));
        System.out.println(var.replace("ma", "nie"));
        String[] splitted = var.split(" ");
        /// Zadanie 2
        String text = scanner.nextLine();
        System.out.println("Pobrany tekst: " + text);
        text = text.toLowerCase();
        System.out.println("Tekst z małymi literami: " + text);
        /// Zadanie 3
        String line = scanner.nextLine();
        StringBuilder result = new StringBuilder(line);
        while (!line.contains("stop")) {
            line = scanner.nextLine();
            result.append(line);
        }
        String resultString = result.toString();
        int stopIndex = resultString.indexOf("stop");
        resultString = resultString.substring(0, stopIndex);
        System.out.println(resultString);
        /// Zadanie 4
        System.out.println("PODAJ TEKST: ");
        String lineEx4 = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lineEx4.length(); i++) {
            if(i%2 == 0){
                stringBuilder.append('\n');
            } else {
                stringBuilder.append(lineEx4.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
