package org.lession6.Part1_2;

public abstract class Man implements IBasicCreditLine {
    private String firstName;
    private String secondName;
    private Sex sex;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Sex getSex() {
        return sex;
    }
    public abstract void getAllInfo ();

    public Man (String firstName, String secondName, Sex sex) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.sex = sex;
    }
}
