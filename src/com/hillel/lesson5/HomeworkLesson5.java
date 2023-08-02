package com.hillel.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkLesson5 {

    public static void main(String[] args) throws IOException {
        result(findAverage());

    }

    private static float findAverage() throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println(" баллы ");

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        int fourthNumber = Integer.parseInt(reader.readLine());
        int fifthNumber = Integer.parseInt(reader.readLine());

        return (float) (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber) / 5;

    }


    private static void result(float average) {
        if (average >= 10 && average <= 12) {
            System.out.println(" повышенная степендия ");
        } else  if (average >= 8 && average < 10 ) {
            System.out.println(" обычная степендия");
        } else if (average < 8 && average > 0) {
            System.out.println(" нет степендии ");
        } else {
            System.out.println(" данные  получены не верные данные ");
        }
    }
}
