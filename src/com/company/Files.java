package com.company;

import java.io.*;

public class Files {
    public static void main(String[] args) {
        String filePath = "D:\\tekst.txt";
        save(filePath);
        load(filePath);
    }

    private static void save(String filePath) {
        try (PrintWriter printWriter = new PrintWriter(filePath)) {
            printWriter.println("linijka do zapisu"); /// tu wpisujemy co mamy zapisać do pliku (między klamerkami try)
            printWriter.println("Druga linijka do zapisu");
            printWriter.flush();
        } catch (IOException ex) {
            System.out.println("Błąd " + ex.getMessage());
        }
    }

    private static void load(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line = bufferedReader.readLine(); /// wczytujemy linijkę z pliku
            while (line != null) { /// będziemy odczytywać linijki do czasu, aż nie trafimy na null (null oznacza koniec pliku)
                System.out.println(line); /// w tym miejscu możemy operować na obiekcie line, np. dzieląc go na części (metoda split) albo zastępując jakieś ciągi (metoda replace)
                line = bufferedReader.readLine(); /// odczytujemy kolejną linijkę
            }
        } catch (IOException ex) {
            System.out.println("Błąd " + ex.getMessage());
        }
    }
}
