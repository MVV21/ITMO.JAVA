package org.lession6.Part1_2;

public class Customer extends Man {
    String bankName;
    private Double creditPercent = 15.0;

    @Override
    public void getAllInfo() {
        System.out.println(super.getFirstName() +"\\n"+ super.getSecondName() + "\\n" + super.getSex());
    }

    public Customer (String firstName, String secondName, Sex sex, String bankName) {
        super(firstName, secondName, sex);
        this.bankName = bankName;
    }

    @Override
    public void creditPercentInfo() {
        System.out.println(adressTo() + super.getFirstName()+ " " + super.getSecondName() + "! Your credit percent is " + creditPercent + "%.");
    }

    @Override
    public String adressTo() {
        return "Dear ";
    }

}

