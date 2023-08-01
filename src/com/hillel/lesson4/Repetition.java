package com.hillel.lesson4;

import java.util.concurrent.atomic.AtomicInteger;

public class Repetition {

    public static void main(String[] args) {

        int a = 3000;
        int b = 4500;
        int c = 5800;
        int time = 10;
        float tax = 0.05F;



        int earning1 = ( a * 12) * time;
        System.out.println(earning1);
        int earning2 = ( b * 12) * time;
        System.out.println(earning2);
        int earning3 = ( c * 12 ) * time;
        System.out.println(earning3);

        int earning1tax = (int) ((float) earning1 * tax);
        System.out.println(earning1tax);
        int earning2tax = (int) ((float) earning2 * tax);
        System.out.println(earning2tax);
        int earning3tax = (int) ((float) earning3 * tax);
        System.out.println(earning3tax);

        int taxfree1 = (earning1 - earning1tax);
        System.out.println(taxfree1);
        int taxfree2 = (earning2 - earning2tax);
        System.out.println(taxfree2);
        int taxfree3 = (earning3 - earning3tax);
        System.out.println(taxfree3);

        float sum = ((float) taxfree1 + taxfree2 + taxfree3) / 3;
        System.out.println(sum);





    }



}
