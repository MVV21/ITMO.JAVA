package org.lession6.Part1_2;

public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("Boris", "Ivanov", Sex.MALE, "Sber");
        customer1.creditPercentInfo();

        BankEmployee employee1 = new BankEmployee("Viktor", "Petrov", Sex.MALE, "Sber");
        BankEmployee employee2 = new BankEmployee("Elena", "Sidorova", Sex.FEMALE, "Sber");
        employee1.creditPercentInfo();
        employee2.creditPercentInfo();
    }
}
