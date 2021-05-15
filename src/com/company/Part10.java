package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Part10 {
    private final static Scanner READER = new Scanner(System.in);

    public static void main(String[] args) {
        /*exercises1And2();
        exercise3();
        exercise4("D:\\plik.txt");
        exercise5("D:\\plik.txt");
        exercise6("D:\\plik.txt");
        exercise7("D:\\plik.txt", "D:\\plik2.txt");
        exercise8("D:\\plik.txt");
        exercise9("D:\\plik.txt", 2);
        exercise10();
        exercise11("D:\\plik.txt");
        exercise12("D:\\plik.txt"); */
    }

    private static void exercises1And2() {
        System.out.println("Zadanie 1");
        System.out.println("Wpisz wartość typu int");
        int number = Integer.parseInt(READER.nextLine());
        try {
            System.out.println(5 / number); /// gdybyśmy nie dali try i catch, to w momencie wpisania 0 rzucony zostanie wyjątek i program zakończy działanie
        } catch (ArithmeticException ex) { /// jak wpiszemy poza blokami try {} catch {} System.out.println(5 / 0); to dowiemy się jakiego typu wyjątek się pojawił (ArithmeticException)
            System.out.println("Wpisałeś zero");
            System.out.println("Zadanie 2"); /// dodano w zadaniu 2
            ex.printStackTrace(); /// dodano w zadaniu 2
        }
    }

    private static void exercise3() {
        System.out.println("Zadanie 3");
        File file = new File("sciezkaPliku");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("Nie udało się utworzyć pliku");
                return; /// kończymy zadanie, bo nie udało się utworzyć pliku
            }
        }
        try (Scanner reader = new  Scanner(file)) {
            String firstLine = reader.nextLine();
            System.out.println(firstLine);
        } catch (FileNotFoundException ex) {
            System.out.println("Nie udało się znaleźć pliku");
        } catch (NoSuchElementException ex) {
            System.out.println("Plik nie ma zawartości");
        }
    }

    private static void exercise4(String filePath) {
        System.out.println("Zadanie 4");
        File file = new File(filePath);
        if (!file.exists()) {
            return; /// kończymy zadanie, bo plik nie istnieje
        }
        try (FileReader reader = new FileReader(file)) {
            int var;
            while ((var = reader.read()) != -1 && (char) var != 'k') {
                System.out.print((char) var);
            }
        } catch (IOException  ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }

    private static void exercise5(String filePath) {
        System.out.println("Zadanie 5");
        File file = new File(filePath);
        if (!file.exists()) {
            return; /// kończymy zadanie, bo plik nie istnieje
        }
        try (FileReader reader = new FileReader(file)) {
            int var;
            char newLineChar = '\r'; /// zależnie od systemu operacyjnego znak nowej linii to \n lub \r\n
            char anotherNewLineChar = '\n';
            while ((var = reader.read()) != -1 && (char) var != newLineChar && (char) var != anotherNewLineChar) {
                System.out.print((char) var);
            }
        } catch (IOException  ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }

    private static int exercise6(String filePath) {
        System.out.println("Zadanie 6");
        File file = new File(filePath);
        if (!file.exists()) {
            return 0; /// plik nie istnieje, więc jest 0 znaków
        }
        int numberOfCharacters = 0;
        try (FileReader reader = new FileReader(file)) {
            while ((reader.read()) != -1) {
                numberOfCharacters++; /// zakładamy, że znaki przejścia do nowej linii tez liczymy
            }
        } catch (IOException  ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
        return numberOfCharacters;
    }

    private static void exercise7(String firstPath, String secondPath) {
        System.out.println("Zadanie 7");
        File file = new File(firstPath);
        File secondFile = new File(secondPath);
        if (!file.exists() || !secondFile.exists()) {
            System.out.println("Przynajmniej jeden z plików nie istnieje");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file)); BufferedReader secondReader = new BufferedReader(new FileReader(secondFile))) {
            String firstFileLine, secondFileLine = "";
            while ((firstFileLine = reader.readLine()) != null || (secondFileLine = secondReader.readLine()) != null) {
                if (firstFileLine == null || !firstFileLine.equals(secondFileLine)) {
                    System.out.println("w pierwszym " + firstFileLine + " w drugim " + secondFileLine);
                }
            }
        } catch (IOException ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }

    private static void exercise8(String filePath) {
        System.out.println("Zadanie 8");
        File file = new File(filePath);
        if (!file.exists()) {
            return; /// kończymy zadanie, bo plik nie istnieje
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }

    private static void exercise9(String filePath, int offset) {
        System.out.println("Zadanie 9");
        File file = new File(filePath);
        if (!file.exists()) {
            return; /// kończymy zadanie, bo plik nie istnieje
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            StringBuilder result = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                if (lineNumber % offset == 0) {
                    result.append(line);
                }
                lineNumber++;
            }
            result.reverse();
            System.out.println(result);
        } catch (IOException ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }

    private static void exercise10() {
        System.out.println("Zadanie 10");
        System.out.println("Wprowadź 1, żeby zapisać i 2, żeby odczytać");
        int option = Integer.parseInt(READER.nextLine());
        if (option == 1) {
            readExercise10();
        } else if (option == 2) {
            saveExercise10();
        } else {
            System.out.println("Niepoprawna opcja");
        }
    }

    private static void readExercise10() {
        File file = new File("dane.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("Nie udało się utworzyć pliku");
                return; /// kończymy zadanie, bo nie udało się utworzyć pliku
            }
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            System.out.println(line == null ? "Plik jest pusty" : line);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }

    private static void saveExercise10() {
        File file = new File("dane.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("Nie udało się utworzyć pliku");
                return; /// kończymy zadanie, bo nie udało się utworzyć pliku
            }
        }
        System.out.println("Podaj imię");
        String firstName = READER.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = READER.nextLine();
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(file , false))) {
            writer.println(firstName);
            writer.println(lastName);
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }

    private static void exercise11(String filePath) {
        System.out.println("Zadanie 11");
        File file = new File(filePath);
        if (!file.exists()) {
            return;
        }
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(file , false))) {
            Random generator = new Random();
            for (int i = 0; i < 100; i++) {
                writer.println(generator.nextInt(11));
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }

    private static void exercise12(String filePath) {
        System.out.println("Zadanie 12");
        File file = new File(filePath);
        if (!file.exists()) {
            return;
        }
        int[] numbers = new int[100];
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                numbers[lineNumber] = Integer.parseInt(line);
                lineNumber++;
            }
            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));
        } catch (IOException ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }

}
