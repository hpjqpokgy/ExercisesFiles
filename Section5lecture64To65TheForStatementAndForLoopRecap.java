package com.s4ve;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculationInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculationInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculationInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculationInterest(10000.0, 5.0));
        System.out.println("****************");
        for (int i = 1; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        
        //Using the for starement, call the calculation method with
        //the amount of 1000 with an interestRate of 2,3,4,5,6,7, and 8
        //and print to the console window.
        for(int i=2; i<9; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculationInterest(10000.0, i)));
        }
        System.out.println("****************");
        //How would you modify for the loop above to do the same thing as
        // show but to start from 8% and work back to 2%
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculationInterest(10000.0, i)));
        }
        System.out.println("****************");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculationInterest(10000.0, i)));

        }
        //create a for statement any range of numbers
        //Determine if the number is a prime number using the isPrime method
        //if it is a prime number, print it out AND increment a count the
        //if the count is 3 exit the for loop
        // hint" use the break; statement to exit.

        int count=0;
        for(int i=10; i<50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count ==10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }


    }

        public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for (int i=2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping" +i);
            if(n % i == 0) {
                return false;
            }

        }
            return true;
    }
        public static double calculationInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));

    }
}
