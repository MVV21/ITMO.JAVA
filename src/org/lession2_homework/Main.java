package org.lession2_homework;

public class Main {
    public static void main (String[] args) {
        int a = 30000;
        int b = 100000;

        long c = 30000L;
        long d = 100000;

        double e = 30000;
        double f = 100000;

        int intSum = Calculator.sum(a, b);
        int intMult = Calculator.mult(a, b);
        double intDiv = Calculator.div(a, b);
        int intSubtr = Calculator.subtr(a, b);
        System.out.println("int: sum = " + intSum + ", mult = " + intMult + ", div = " + intDiv + ", subtr = " + intSubtr);

        long longSum = Calculator.sum(c, d);
        long longMult = Calculator.mult(c, d);
        double longDiv = Calculator.div(c, d);
        long longSubtr = Calculator.subtr(c, d);
        System.out.println("long: sum = " + longSum + ", mult = " + longMult + ", div = " + longDiv + ", subtr = " + longSubtr);

        double doubleSum = Calculator.sum(e, f);
        double doubleMult = Calculator.mult(e, f);
        double doubleDiv = Calculator.div(e, f);
        double doubleSubtr = Calculator.subtr(e, f);
        System.out.println("double: sum = " + doubleSum + ", mult = " + doubleMult + ", div = " + doubleDiv + ", subtr = " + doubleSubtr);

        System.out.println(Calculator.div(30,2));
        Flat flat1 = new Flat(3,105,2, WC.Joint, false, true, 3.0, 8700000);
        System.out.println(flat1.toString());
        Flat flat2 = new Flat();
        flat2.setPrice(1000000);
        System.out.println(flat2.toString());

    }
}

