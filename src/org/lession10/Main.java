package org.lession10;

import java.nio.CharBuffer;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        File file1 = new File("src/Text.txt");
        File file2 = new File("src/newText.txt");

//        Задание №1
//        System.out.println(firstMethod(file1));

//        Задание №2
//        String text = "А.С. Пушкин";
//        secondMethod(file1, text);
//        System.out.println(firstMethod(file1));

//        Задание №3
//        thirdMethod(file1, file2, true);
//        System.out.println(firstMethod(file1));
//        System.out.println(firstMethod(file2));

//        Задание №4
        replacementToDollar(file1);
        System.out.println(firstMethod(file1));
    }

    public static List<String> firstMethod(File file) {
        List<String> arrayList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                arrayList.add(input);
            }
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
        return arrayList;
    }

    public static void secondMethod(File file, boolean bool,  String text) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileOutputStream os = new FileOutputStream(file, bool)) {
             byte[] array = text.getBytes();
             baos.write(array);
             baos.writeTo(os);
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }

    public static void thirdMethod(File file1, File file2, boolean bool){
        List<String> list = firstMethod(file2);
        String textFile2 = String.join(" ", list);
        secondMethod(file1, bool, textFile2);
    }

    public static void replacementToDollar (File file) {
        List<String> list = firstMethod(file);
        String newtxt = String.join(" ", list).replaceAll("[^а-яА-Яa-zA-Z\\d]", "\\$");
        secondMethod(file, false, newtxt);
    }
}
