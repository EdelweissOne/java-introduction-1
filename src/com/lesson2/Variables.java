package com.lesson2;

public class Variables {

    public static void main(String[] args) {


        // целые

        byte myByte = 101;
        System.out.println("this is byte: " + myByte);

        short myShort = 30000;
        System.out.println("this is short: " + myShort);

        int myInt = 345_457_567;
        System.out.println("this is int: " + myInt);

        long myLong = 100_000_000_000L;
        System.out.println("this is long: " + myLong);

        // дробные

        float myFloat = 45.890F;
        System.out.println(myFloat);

        double myDouble = 568678678.45;
        System.out.println(myDouble);

        boolean isValid = false;
        System.out.println(isValid);

        char myChar = '&';
        System.out.println(myChar);
        char myNumberChar = 56756;
        System.out.println(myNumberChar);
        char ch3 = '\u0054';
        System.out.println(ch3);

        String string = "test";
        System.out.println("this is tring" + string);

    }

}
