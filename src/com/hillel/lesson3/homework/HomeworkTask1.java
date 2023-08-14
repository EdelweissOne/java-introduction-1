package com.hillel.lesson3.homework;

public class HomeworkTask1 {

    public static void main(String[] args) {
        // task 1
        float r1 = 1;
        float r2 = 0.5f;
        float r3 = 0.2f;
        float kp = 0.7f;

        float m1 = (float) (((float)4 / 3) * Math.PI * (float)Math.pow(r1, 3)) * kp;
        System.out.println(m1);
        float m2= (float) (((float)4 / 3)  * Math.PI * (float)Math.pow(r2, 3)) * kp;
        System.out.println(m2);
        float m3= (float) (((float)4 / 3)  * Math.PI * (float)Math.pow(r3, 3)) * kp;
        System.out.println(m3);

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
