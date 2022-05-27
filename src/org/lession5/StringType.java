package org.lession5;

import org.lession4.Random;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringType {
    public static void longestWord (String text){
        System.out.println("-----1-----");
        int count = 0;
        text = text.replaceAll("-", " ");
        text = text.replaceAll(";", " ");
        text = text.replaceAll(",", " ");
        text = text.replaceAll("  ", " ");
        String [] split = text.split(" ");
//        System.out.println(Arrays.toString(split));

        int[] splitLength = new int[split.length];
        for(int i = 0; i < split.length; i++ ) {
            splitLength[i] = split[i].length();
        }

        int [] sortedSplitLength = org.lession4.MergeSort.mergeSort(splitLength); //сортировка по длинам слов

        for (int k = 0; k <sortedSplitLength.length; k++) { //определение количества слов максимальной длины
            if (sortedSplitLength[sortedSplitLength.length-1] == sortedSplitLength[k]){
                count++;
            }
        }
        int [] LongNumberArray = new int [count];

        int count2 = 0;
        for (int j = 0; j < splitLength.length; j++) { //заполнение массива с указателями на позиции элементов с макс. дллиной основного массива,
            if(splitLength[j] == sortedSplitLength[sortedSplitLength.length-1]) {
//                catcher = j;
                LongNumberArray[count2++] = j;
            }
        }
        String [] resultArray = new String[count];
        for (int s = 0; s < count; s++){
            resultArray[s] = split[LongNumberArray[s]];
        }

        System.out.println(Arrays.toString(resultArray));
    }

    public static void isPalindrome (String word){
        System.out.println("-----2-----");
        StringBuilder check = new StringBuilder(word);
        if (word.equalsIgnoreCase(check.reverse().toString())) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not palindrome");
        }
    }

    public static String censorship (String text, String censContext) {
        System.out.println("-----3-----");
        Pattern pattern = Pattern.compile(censContext, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        String newText = matcher.replaceAll("[Вырезано цензурой]");
        return newText;

    }

    public static int numEntry (String text, String subtext) {
        System.out.println("-----4-----");
        int numEntry = 0;
        Pattern pattern = Pattern.compile(subtext);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            numEntry++;
        }
        return numEntry;
    }

    public static String inversion (String text) {
        System.out.println("-----5-----");
        String[] split = text.split(" ");
        for (int i = 0; i < split.length; i++) {
            StringBuilder revers = new StringBuilder(split[i]);
            split[i] = revers.reverse().toString();
        }

            String result = new String();
            for (int k = 0; k < split.length; k++) {
                result = String.join(" ", result, split[k]);

            }
        return result.trim();
    }

//    public static void longWord(String text){
//        int length = 0;
//        String result = new String();
//        String regex = "\w.+?\s";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(text);
//        for (int i = 50; i > 0; i-- ){
//            if (i == matcher.find().length()) {
//                length = i;
//                break;
//            }
//        }
//        while(matcher.find().length == length){
//            int start = matcher.start();
//            int end = matcher.end();
//            System.out.println(text.substring(start, end));
//        }
//    }




    public static void main(String[] args) {
//        String text = "Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему. Все смешалось в доме Облонских.";
//        longestWord(text);
        isPalindrome("Топот");
//        System.out.println(censorship(text, "Все"));
//        System.out.println(numEntry(text, "Все"));
//        String text2 = "This is a test string";
//        System.out.println(inversion(text2));;
    }

}


