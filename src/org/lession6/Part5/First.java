package org.lession6.Part5;

import java.util.Scanner;

public class First {
    public int age;
    Scanner scan = new Scanner(System.in);

    public void getInfo() {
        System.out.println("Введите свой возраст: ");
        age = scan.nextInt();
    }
}
