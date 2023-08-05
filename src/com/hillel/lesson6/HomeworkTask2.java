package com.hillel.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выражение ");

        int number1 = Integer.parseInt(reader.readLine());
        String operation = reader.readLine();
        int number2 = Integer.parseInt(reader.readLine());

        int result = operation(number1, operation, number2);
        System.out.println("  Результат: " + result);
    }

    public static int operation(int num1, String operation, int num2) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }
}
