package com.hillel.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Количество яблок:  ");
        int apple = Integer.parseInt(reader.readLine());
        int bigJar = 5;
        int mediumJar = 3;
        int smallJar = 1;

        int numBig = apple / bigJar;
        int remainingApples = apple % bigJar;
        int numMedium = remainingApples / mediumJar;
         remainingApples  %= mediumJar;
        int numSmall = remainingApples;

        System.out.println("Количество банок большого размера: " + numBig);
        System.out.println("Количество банок среднего размера: " + numMedium);
        System.out.println("Количество банок маленького размера: " + numSmall);
    }
}
