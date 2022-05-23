package org.lession5;

import org.lession4.Random;

import java.util.Arrays;

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

    public static boolean isPalindrome (String word){
        System.out.println("-----2-----");
        word = word.toLowerCase();
        boolean isPalindrome = true;
        char[] letter = word.toCharArray();
        for(int i = 0; i < word.length()/2; i++){
            if (letter[i] != letter[word.length()-1-i]){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static String replacement (String text, String oldWord, String newWord) {
        System.out.println("-----3-----");
        boolean isTrue = false;
        String[] split = text.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (oldWord.equalsIgnoreCase(split[i])) {

            }

        }
            return text.replaceAll(oldWord, newWord);

    }


    public static void main(String[] args) {
        longestWord("Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему. Все смешалось в доме Облонских.");
        System.out.println(isPalindrome("Казак"));
        String text = "Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему. Все смешалось в доме Облонских.";
        System.out.println(replacement(text, "все", "почти все"));
    }

}


