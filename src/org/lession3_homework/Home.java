package org.lession3_homework;

import java.util.Scanner;
import java.time.LocalDate;

public class Home {
    private int countFloats;
    private int yearConst;
    private String name;

    public void setCountFloats(int countFloats) {
        this.countFloats = countFloats;
    }

    public void setYearConst(int yearConst) {
        this.yearConst = yearConst;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountFloats() {
        return countFloats;
    }

    public int getYearConst() {
        return yearConst;
    }

    public String getName() {
        return name;
    }

    public int returnYearExist () {
        LocalDate current_date = LocalDate.now();
        return (current_date.getYear() - yearConst);
    }

    @Override
    public String toString() {
        return "Home{" +
                ", countFloats=" + countFloats +
                ", yearConst=" + yearConst +
                ", name='" + name + '\'' +
                '}';
    }
}
class HomeProgram {
    public static void main(String[] args) {
        Home home1 = new Home();
        home1.setYearConst(1886);
        home1.setCountFloats(2);
        home1.setName("Усадьба К.Н.Боголюбского");
        System.out.println(home1.toString() + "; number of years since construction: " + home1.returnYearExist());

        Home home2 = new Home();
        home2.setYearConst(1972);
        home2.setCountFloats(5);
        home2.setName("Хрущевка");
        System.out.println(home2.toString() + "; number of years since construction: " + home2.returnYearExist());

        Home home3 = new Home();
        home3.setYearConst(2020);
        home3.setCountFloats(8);
        home3.setName("ЖК 'Райские кущи'");
        System.out.println(home3.toString() + "; number of years since construction: " + home3.returnYearExist());
    }
}




