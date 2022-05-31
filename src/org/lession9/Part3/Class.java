package org.lession9.Part3;

import java.util.*;

public class Class {
    public static void main (String[] args){

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long timeArrayList = System.currentTimeMillis();
        addBillion(arrayList);
        checkElement(arrayList);
        long time1 = System.currentTimeMillis() - timeArrayList;

        long timeLinkedList = System.currentTimeMillis();
        addBillion(linkedList);
        checkElement(linkedList);
        long time2 = System.currentTimeMillis() - timeLinkedList;
        System.out.println("Работа с ArrayList длиласть " + (time1/1000) + " секунд");
        System.out.println("Работа с LinkedList длиласть " + (time2/1000) + " секунд");
    }

    public static void addBillion (List<Integer> list) {
        for (int i = 0; i < 1000000; i++){
            list.add((int)(Math.random()*1000));
        }
    }

    public static void checkElement (List<Integer> list){
        for (int k = 0; k < 100000; k++){
            int rand = (int)(Math.random()*1000000);
            System.out.println(list.get(rand));
        }
    }
}
