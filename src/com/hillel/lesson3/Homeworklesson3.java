package com.hillel.lesson3;

public class Homeworklesson3 {

    // task 1
    public static void main(String[] args) {

        float r1 = 1;
        float r2 = 0.5F;
        float r3 = 0.2F;
        float kp = 0.7F;


        float m1 = (float) (4 / 3 * Math.PI * (float)Math.pow(r1, 3)) * kp;
        float m2= (float) (4 / 3 * Math.PI * (float)Math.pow(r2, 3))* kp;
        float m3= (float) (4 / 3 * Math.PI * (float)Math.pow(r3, 3)) * kp;

        float m0 = (m1+m2+m3);
        System.out.println(" Mass: " + m0);

        //task 2

        int a = 4;
        int b = 5;
        int c = 9;

        float result = (float) (((Math.abs((float) a - b)) / Math.pow((float)a+b, 3) - Math.sqrt(c)));
        System.out.println(" result: " + result);


    }


}
