package org.lession1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//1
        System.out.println("-----1-----");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
//2
        System.out.println("-----2-----");
        System.out.println((46 + 10) * (10.0 / 3));
        System.out.println(29.0 * 4 * (-15));
//3
        System.out.println("-----3-----");
        int number = 2;
        double result = (number / 10.0) / 10;
        System.out.println(result);
//4
        System.out.println("-----4-----");
        result = 3.6 * 4.1 * 5.9;
        System.out.println(result);
//5
        System.out.println("-----5-----");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int first = scan.nextInt();
        System.out.println("Введите второе число:");
        int second = scan.nextInt();
        System.out.println("Введите третье число:");
        int third = scan.nextInt();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
//6
        System.out.println("-----6-----");
        System.out.println("Введите целое число:");
        int b = scan.nextInt();
        if (b%2 != 0) {
            System.out.println("Нечетное");
        } else {
            if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            } else {
                System.out.println("Четное");
            }
        }
    }
}