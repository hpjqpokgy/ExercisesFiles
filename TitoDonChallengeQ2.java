package com.s4ve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int length;
        Scanner input = new Scanner(System.in);

        System.out.println("How many friends you have");
        length = input.nextInt();

        String[] names = new String[length];

        for (int friend = 0; friend < length; friend++ ) {

            System.out.println("Enter your friend name 1: " + (friend+1));
            names[friend] = input.next();
            
        }
        input.close();

        System.out.println("Your friends are");
        for (int friend = 0; friend < length; friend++){
            System.out.println(names[friend]);
        }
    }
}
