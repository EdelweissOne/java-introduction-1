package com.hillel.lesson7.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkTask3 {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(" количество машин");
        methodFor();
        methodWhile();
    }

    public static void methodFor() throws IOException, InterruptedException {
        int input = Integer.parseInt(READER.readLine());
        for (int i = 1; i <= input; i++) {
            System.out.println(i + " : ");
            soap();
            wash();
            dry();
        }
    }

    public static void methodWhile() throws IOException, InterruptedException {
        int input = Integer.parseInt(READER.readLine());
        int i = 1;
        while (i <= input) {
            System.out.println(i + " : ");
            soap();
            wash();
            dry();
            i++;
        }
    }

    private static void soap() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(" soap ");
    }

    private static void wash() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(" wash ");
    }

    private static void dry() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(" dry ");
    }
}
