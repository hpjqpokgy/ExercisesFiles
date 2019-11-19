package com.s4ve;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        printOfTheWeek(-1);
//        int value = 1;
//        if(value == 1) {
//            System.out.println("Value was 1 ");
//        }else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//
//        int switchValue = 5;
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
        }
        private static void printOfTheWeek(int day) {


            if (day == 0) {
                System.out.println("sunday");
            }   else if (day == 1) {
                System.out.println("Monday");
            }   else if (day == 2) {
                System.out.println("Tuesday");
            }   else if (day == 3) {
                System.out.println("Wednesday");
            }   else if (day == 4) {
                System.out.println("Thursday");
            }   else if (day == 5) {
                System.out.println("Friday");
            }   else if (day == 6) {
                System.out.println("Saturday");
            }   else {
                System.out.println("Invalid Day");


            }

            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid day");
                    break;
            }

    }
}
