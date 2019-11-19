package com.s4ve;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
//	    int count=1;
//        while(count !=6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//            for(int i=6; i!=6; i++) {
//                System.out.println("Count value is " + count);
//            }


        ////////////////////////////////////////////////////////////
//
//
//                count =1;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//                    } while(count != 6);
        //////////////////////////////////////////////////
        //FOR LOOP IS NOT IDENTICAL TO THE ABOVE WHILE LOOP!
        // FOR(int i=1; i<7; i++) b{
        //System.out.println("Count value is " + count);
//        for(count = 1; count !=6; count++) {
//            System.out.println("count is value " + count);
//        count = 1;
//        while(true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        int number = 4;
//        int finishNumber = 20;
//
//        while ( number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//
//            System.out.println("even number " + number);

        //MODIFY THE WHILE CODE ABOVE
        //MAKE IT ALSO RECORD THE TOTAL OF EVEN NUMBERS IT HAS FOUND
        //AND BREAK ONVE 5 ARE FOUND
        //AND AT THE END, DISPLAY THE TOTAL OF EVEN NUMBERS FOUND

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even Number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >=5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    //CREATE A METHOD CALLED isEvenNumber THAT TAKE PARAMETER OF TYPE INT
    // ITS PURPOSE IS TO DETERMINE IF THE ARGUMENT PASSED TO THE METHOD IS
    // RETURN THE TRUE IF AN EVEN NUMBER, OTHERWISE RETURN FALSE;
    

    public  static boolean isEvenNumber(int number) {
        if ((number % 2) == 0 ) {
            return true;
        } else {
            return  false;
        }
    }

}
