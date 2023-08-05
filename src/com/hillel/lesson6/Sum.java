package com.hillel.lesson6;

public class Sum {

    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        double result = sum(number1, number2);
        System.out.println(result);

        System.out.println(sum(4 , 5));
    }
    public static double sum(int n1, int n2) {
        return n1 + n2;
    }
}
