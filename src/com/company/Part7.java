package com.company;

import java.util.Random;

public class Part7 {
    public static void main(String[] args) {
        final int TAB_SIZE = 20;
        double[] tab = new double[TAB_SIZE];
        double sum = 0;
        double min = 0;
        double max = 0;
        Random random = new Random();
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
    }
}
