package Testcases;

import org.testng.annotations.Test;

public class Lesson6 {

    @Test

    public void testIfElse(){

        int income = 40000;

        if (income >= 0 && income <= 10275){
            System.out.println("your tax will be 10%");
        }
        else if (income >= 10276 && income <=41775){
            System.out.println("your tax will be12%");
        }
        else if (income >= 41776 && income <= 89075){
            System.out.println("your tax will be22%");
        }
        else {
            System.out.println("please call your CPA");
        }

    }

    @Test

    public void testSwitch(){

    String department = "parts";

    switch (department){
        case "sales":
            System.out.println("Sales depatrment works from 8am to 12pm.");
            break;
        case "operations":
            System.out.println("Operations depatrment works from 8am to 10pm.");
            break;
        case "service":
            System.out.println("Service depatrment works from 8am to 6pm.");
            break;
        case "parts":
            System.out.println("Parts depatrment works from 8am to 6pm.");
            break;
        case "customerservice":
            System.out.println("Customer Service works from 8am to 12pm.");
            break;
        case "recycle":
            System.out.println("Recycle depatrment works from 8am to 10pm.");
            break;
    }
    }

    @Test

    public void testForLoop(){

        for (int hours = 0; hours < 24; hours++){
            System.out.println(hours);
            hours++;
        }
    }

}
