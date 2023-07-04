package Testcases;

import org.testng.annotations.Test;

public class JavaOOP {

        int salary = 30000;
        int overtime = 20;
        int rate = 10;
        private int overtimeTuesdayGeneral = 2;


        public int  wage() {
            int totalWage = salary + overtimeTuesdayGeneral + (overtime * rate);
            return totalWage;

        }

        public int  calculateWage(int salary, int overtime, int rate) {
            int totalWage = salary + (overtime * rate);
            return totalWage;
        }
        public int employeeJessica() {
            int salary = 20000;
            int overtime = 10 + overtimeTuesdayGeneral;
            int rate = 15;
            return calculateWage(salary, overtime, rate);

        }

        public void name(){

        }

        public void harvesting( int people, String month, int tools){
            System.out.println("Harvest for lettuce");
        }
        public void harvesting( int people, int tools){
            System.out.println("Harvest for apples and oranges");

        }

        public void apples(){
            harvesting(  5, "hh", 1);
        }


        public void harvesting(){


        }
    }

