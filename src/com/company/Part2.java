package com.company;

import java.util.Scanner;

public class Part2 {
    /** To jest nasza metoda */
    public static void main(String[] args) {
        //// Zadanie 1
        float floatNumber;
        floatNumber = 0.1f;
        double doubleNumber = floatNumber;
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        /// Zadanie 2
        char var1 = 's';
        char var2 = '\u0073';
        System.out.println(var1);
        System.out.println(var2);
        /// Zadanie 3
        long varLong = 5000000000L;
        System.out.println("Zainicjowałem zmienną. Jej wartość to: " + varLong);
        /// Zadanie 4
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println("   *");
        System.out.println("   *");
        /// Zadanie 5
        System.out.print("Ala\nma");
        /// Zadanie 6
        final boolean CONSTANT = true;
        /// CONSTANT = false;
        /// Zadanie 7
        // float variable, variable; - NIE DA SIĘ
        /// Zadanie 8
        float variable, Variable;
        /// Zadanie 9 - to jest komentarz
        System.out.println();
        /// Zadanie 10
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        /// Zadanie 11
        System.out.print("____________________ \n" +
                "\\______   \\______   \\\n" +
                " |     ___/|     ___/\n" +
                " |    |    |    |    \n" +
                " |____|    |____|    \n" +
                "                     \n");
        /// Zadanie 12
        float floatVar = 100000001;
        System.out.println(floatVar);
        /// Zadanie 13
        float var;
        // System.out.println(var); - NIE DA SIĘ
        /// Zadanie 14
        int liczba = 13;
        System.out.printf("%s%d", "Wpisałeś liczbę ", liczba);
        /// Zadanie 15
        System.out.println();
        System.out.println("Podaj liczbę typu całkowitego");
        int intVariable;
        Scanner scanner = new Scanner(System.in);
        intVariable = scanner.nextInt();
        System.out.println("Wpisałeś liczbę " + intVariable);
        /// Zadanie 16
        double doubleVar;
        doubleVar = scanner.nextDouble();
        System.out.println("Wpisałeś liczbę " + doubleVar);
        /// Zadanie 17
        boolean booleanVar;
        booleanVar = scanner.nextBoolean();
        System.out.println("Wpisałeś wartość " + booleanVar);
    }
}
