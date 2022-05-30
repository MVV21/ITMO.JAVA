package org.lession6.Part1_2;

public class BankEmployee extends Man{
    String bankName;
    private Double creditPercent = 10.0;

    @Override
    public void getAllInfo() {
        System.out.println(super.getFirstName() +"\\n"+ super.getSecondName() + "\\n" + bankName );
    }

    public BankEmployee (String firstName, String secondName, Sex sex, String bankName) {
        super(firstName, secondName, sex);
        this.bankName = bankName;
    }

    @Override
    public void creditPercentInfo() {
        System.out.println(adressTo() + super.getSecondName() + "! Your credit percent is " + creditPercent + "%.");
    }

    @Override
    public String adressTo() {
        if (super.getSex() == Sex.MALE) {
            return "Mr. ";
        } else {
            return "Ms. ";
        }
    }
}
