package org.lession4;

import java.util.Arrays;
import java.util.Scanner;

public class PartTwo {
    public static  void firstMethod() {
        System.out.println("---1---");
        boolean checkResult = true;
        int mas[] = Random.randomArray(6);
        System.out.println(Arrays.toString(mas));
//        int mas[] = {1, 2, 3, 4, 5, 6};
        for (int i = mas.length-1; i >0; i--) {
            if (mas[i] <= mas[i-1]){
                checkResult = false;
            }
        }
        if (checkResult) {
            System.out.println("OK");
        }else{
            System.out.println("Please, try again");
        }
    }

    public static void secondMethod() {
        System.out.println("---2---");
        Scanner scan = new Scanner(System.in);
        System.out.println("Определите длину массива:");
        int masSize = scan.nextInt();
        int mas[] = new int[masSize];

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите " + masSize + " элемента(ов) массива: ");
        for(int i = 0; i < masSize; i++){
            mas[i] = scan2.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(mas));
  }

    public static  void thirdMethod() {
        System.out.println("---3---");
        int masSize = (int) (Math.random() * 10);
        int mas[] = Random.randomArray(masSize);
        System.out.println("Array 1: " + Arrays.toString(mas));
        int buffer = mas[0];
        mas[0] = mas[mas.length-1];
        mas[mas.length-1] = buffer;
        System.out.println("Array 2: " + Arrays.toString(mas));
    }

    public static  void fourthMethod(){
        System.out.println("---4---");
        int masSize = (int) (Math.random() * 10);
        int mas[] = Random.randomArray(masSize);
        System.out.println("Заданный массив: " + Arrays.toString(mas));

        int catcher = -1;

        int cashMas[] = new int[mas.length];
        for (int x = 0; x < cashMas.length; x++){
            cashMas[x] = -1;
        }

        for(int i = 0; i < mas.length; i++){
            for(int j = i+1; j < mas.length; j++) {
               if(mas[i] == mas[j]){
                   cashMas[i] = i;
                   cashMas[j] = j;
               }
            }
        }
        System.out.println("Данный массив описывает порядковые номера элементов в заданном массиве. В случае, если определенные эначения заданного массива повторяются, то на месте этого элемента отобразится его порядковый номер. Если элемент не повторяется, то его значение будет равно '-1': " );
        System.out.println(Arrays.toString(cashMas));
        for(int k = 0; k < cashMas.length; k++){
            if (cashMas[k] == -1){
                catcher = k;
                break;
            }
        }

        System.out.println("Первое неповторяющееся в заданном массиве число: " + mas[catcher]);
    }






}





class ProgramTwo {
    public static void main(String[] args) {
//        PartTwo.firstMethod();
//        PartTwo.secondMethod();
//        PartTwo.thirdMethod();
//        PartTwo.fourthMethod();
    }
}