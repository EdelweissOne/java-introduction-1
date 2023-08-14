package com.hillel.lesson5.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Parameters ");

        int width = Integer.parseInt(reader.readLine());
        int length = Integer.parseInt(reader.readLine());
        int height = Integer.parseInt(reader.readLine());
        luggage(width, length, height);
    }


    public static void luggage(int width, int length, int height) {
        if (width <= 20 && length <= 55 && height <= 40) {
            System.out.println(" допустим в ручную ");
        } else if (width <= 22 && length <= 40 && height <= 53) {
            System.out.println(" допустим в багаж ");
        } else {
            System.out.println(" не допустим ");
        }
    }



}
