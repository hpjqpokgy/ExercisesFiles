package com.s4ve;

public class Main {

    public static void main(String[] args) {
	
        float myMinfloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println ("Float minimum value = " + myMaxFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println ("Double minimum value = " + myMaxDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

    }
}
