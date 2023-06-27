package org.example;

import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {

        //String - data variable
        //firstName - variable name
        //"Kiryl" - value

        String firstName = "Kiryl";
        String partyName = " 'Sensation' ";
        int age = 30;
        double price = 399.99;
        int ticket = 1;

        int EarlyBirdsVIPSalary = 349;
        int EarlyGeneralAdmissionSalary = 150;
        int GeneralAdmissionSalary = 180;

        int totalTicketsSalary = EarlyBirdsVIPSalary + EarlyGeneralAdmissionSalary + GeneralAdmissionSalary;
        System.out.println(EarlyBirdsVIPSalary + EarlyGeneralAdmissionSalary + GeneralAdmissionSalary);

         System.out.println("Hello "+ firstName +"! Welcome to ' "+ partyName +". Our data indicates that today you turn " + age +" years Old. " +
                     "We offer you a special gift! With purchase on a VIP admission above $"+ price +", you will get " + ticket +" additional ticket for free!");

        int ten = 10;
        int five = 5;
        String ten10 = "10";
        System.out.println(five + ten);

        int hundred = 100;
        int fifty = 50;
        System.out.println(fifty - hundred);

        int hundredandten = 110;
        int fiftytwo = 52;
        int eight = 8;
        System.out.println(hundredandten - eight + fiftytwo);

        int seven = 7;
        int fiftyfive = 55;
        int six = 6;

        System.out.println((seven * six) - fiftyfive);

    }
}




