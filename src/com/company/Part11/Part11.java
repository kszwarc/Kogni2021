package com.company.Part11;

import java.io.*;

public class Part11 {
    public static void main(String[] args) {
        String filePathBinary = "D:\\plikBinarny.txt";
        exercise1(filePathBinary);
        exercise2(filePathBinary);
        exercise3("D:\\raf.txt");
        String filePathSerializable = "D:\\serializacja.txt";
        exercise4(filePathSerializable);
        exercise5(filePathSerializable);
    }

    private static void exercise1(String filePath) {
        System.out.println("Zadanie 1");
        try (DataOutputStream writer = new DataOutputStream(new FileOutputStream(filePath))) {
            writer.writeUTF("test");
            writer.writeDouble(7.5);
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Błąd " + ex.getMessage());
        }
    }

    private static void exercise2(String filePath) {
        System.out.println("Zadanie 2");
        try (DataInputStream reader = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println(reader.readUTF());
            System.out.println(reader.readDouble());
        } catch (IOException ex) {
            System.out.println("Błąd " + ex.getMessage());
        }
    }

    private static void exercise3(String filePath) {
        System.out.println("Zadanie 3");
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) { /// rw to read write. Możemy odczytywać i zapisywać
            raf.writeUTF("Ala ma dużego kota");
            long position = raf.getFilePointer();
            raf.writeInt(6);
            raf.seek(position); /// zamiast zapamiętywać pozycję mogliśmy odjąć od aktualnej rozmiar inta
            System.out.println("Liczba to " + raf.readInt());
        } catch (IOException ex) {
            System.out.println("Błąd " + ex.getMessage());
        }
    }

    private static void exercise4(String filePath) {
        System.out.println("Zadanie 4");
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            for (int i = 0; i < 5; i++) {
                stream.writeObject(new Person("Imię " + i));
            }
        } catch (IOException ex) {
            System.out.println("Błąd " + ex.getMessage());
        }
    }

    private static void exercise5(String filePath) {
        System.out.println("Zadanie 5");
        try (ObjectInputStream stream = new ObjectInputStream (new FileInputStream(filePath))) {
            for (int i = 0; i < 5; i++) {
                Person person = (Person) stream.readObject();
                System.out.println(person.getFirstName());
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Błąd " + ex.getMessage());
        }
    }
}
