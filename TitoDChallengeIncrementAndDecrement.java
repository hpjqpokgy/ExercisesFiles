package com.s4ve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        String q1 = new String("Enter a Value: ");
        System.out.println(q1);
        a = sc.nextInt();
        String q2 = new String("type 1 to Increment, type 2 Decrement ");
        System.out.println(q2);
        b = sc.nextInt();

    if (b == 1)
    {
        a++;
        System.out.println("value has increment " + a );
    }
    else
        {
            a--;
            System.out.println("value has decrement " + a );
    }


    }
}
