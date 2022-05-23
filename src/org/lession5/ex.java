package org.lession5;

public class ex {
    public static void main(String args[]) {
        String Str = new String("Добро пожаловать на ProgLang.su");
        Str = Str.replaceAll("ProgLang.su",
                "сайт посвященный программированию!");
        System.out.println(Str);
    }
}