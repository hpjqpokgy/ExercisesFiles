   package com.s4ve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double number, squareRoot;
        Scanner scanner =new Scanner(System.in);


        System.out.println("Find the square root of :");
        number = scanner.nextInt();

        squareRoot = Math.sqrt(number);
        System.out.println("\n The Square of a Given Number " + number + " = " + squareRoot );
    }
}
