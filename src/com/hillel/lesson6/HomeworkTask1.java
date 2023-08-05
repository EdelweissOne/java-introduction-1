package com.hillel.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Случайные числа ");

        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        method1(number1, number2, number3);
        method2(number1, number2, number3);
    }

    public static void method1(int numA, int numB, int numC) {
        System.out.println(Math.min(Math.min(numA, numB), Math.min(numC, numB)));
    }

    public static void method2(int numA, int numB, int numC) {
        if (numA < numB && numB < numC) {
            System.out.println(numA);
        } else if (numB < numC && numB < numA) {
            System.out.println(numB);
        } else {
            System.out.println(numC);
        }
    }
}
