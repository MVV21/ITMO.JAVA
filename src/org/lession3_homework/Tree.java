package org.lession3_homework;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    public Tree (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree (int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }
}
class TreeProgram {
    public static void main(String[] args) {
       Tree pine = new Tree(29, "Pine");
       System.out.println(pine.toString());
       Tree oak = new Tree (124, true, "Oak");
       System.out.println(oak.toString());
       Tree weepingWillow = new Tree();
       System.out.println(weepingWillow.toString());
    }
}
