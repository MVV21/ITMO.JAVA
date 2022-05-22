package org.lession4;

import org.lession3_homework.Home;

import java.util.Arrays;
import java.util.Scanner;


public class PartOne {
    public static void firstMethod() {
        System.out.println("---1---");
        int i = 1;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }


    public static void secondMethod() {
        System.out.println("---2---");
        int nums1[] = new int[100 / 3];
        int nums2[] = new int[100 / 5];
        int nums3[] = new int[100 / 15];
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                nums1[a] = i;
                a++;
            }else if (i % 3 != 0 && i % 5 == 0) {
                nums2[b] = i;
                b++;
            }else if (i % 3 == 0 && i % 5 == 0){
                nums1[a] = i;
                nums2[b] = i;
                nums3[c] = i;
                a++;
                b++;
                c++;
            }
        }
        System.out.println("Делится на 3: " + Arrays.toString(nums1));
        System.out.println("Делится на 5: " + Arrays.toString(nums2));
        System.out.println("Делится на 3 и на 5: " + Arrays.toString(nums3));
    }

    public static void thirdMethod() {
        System.out.println("---3---");
        boolean checkResult;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumber = scan.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scan.nextInt();
        System.out.println("Введите третье число:");
        int thirdNumber = scan.nextInt();
        if (firstNumber + secondNumber == thirdNumber) {
            checkResult = true;
            System.out.println(checkResult);
        }
    }

    public static void fourthMethod() {
        System.out.println("---4---");
        boolean checkResult;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumber = scan.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scan.nextInt();
        System.out.println("Введите третье число:");
        int thirdNumber = scan.nextInt();
        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            checkResult = true;
            System.out.println(checkResult);
        }
    }

    public static void fifthMethod() {
        System.out.println("---5---");
        boolean checkResult = false;
        int masSize = 6;
        int mas[] = Random.randomArray(masSize);
        if (mas[0] == 3 || mas[masSize - 1] == 3 ) {
            checkResult = true;
        }
        System.out.println("array = " + Arrays.toString(mas));
        System.out.println(checkResult);
    }

    public static void sixthMethod() {
        System.out.println("---6---");
        boolean checkResult = false;
        int masSize = 6;
        int count = 0;
        int mas[] = Random.randomArray(masSize);
        System.out.println("Массив = " + Arrays.toString(mas));
        for (int i : mas) {
            if (i == 1 || i == 3) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Массив содержит число 1 или 3");
        } else {
            System.out.println("Массив не содержит число 1 или 3");
        }
    }
}

class Program {
        public static void main(String[] args) {
            PartOne.firstMethod();
            PartOne.secondMethod();
            PartOne.thirdMethod();
            PartOne.fourthMethod();
            PartOne.fifthMethod();
            PartOne.sixthMethod();
        }
}

