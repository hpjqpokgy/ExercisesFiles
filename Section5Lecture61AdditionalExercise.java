package com.s4ve;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 5) {
            System.out.println("Value was 1");
        }else if (value == 2 ){
            System.out.println("Value was 2");
        } else {
            System.out.println("value was not 1 or 2");
    }

        int switchValue =1;

        switch(switchValue) {

            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("it was 3, 4, and 5 ");
                break;

            default:
                System.out.println(" was not 3, 4, 5, and 6 ");
                break;


        }


        char charValue = 'G';
        switch(charValue) {

            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(charValue + "was found ");
                break;


            default:
                System.out.println("Could not found A, B, C, D, or");
                break;

        }


            String month = "JUNE";
            switch(month.toUpperCase()) {

                case "JANUARY":
                    System.out.println("Jan");
                    break;
                case "JUNE":
                    System.out.println("Jun");
                    break;
                default:
                    System.out.println("Not sure");



        }



    }
}
