package com.hillel.lesson4;

import java.util.Scanner;

public class Box {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input width, height, dept : ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int depth = scanner.nextInt();


        System.out.println(calculateVolume(width, height, depth));
    }
    public static int calculateVolume(int width, int height, int depth) {

        return width * height * depth;
    }
}
