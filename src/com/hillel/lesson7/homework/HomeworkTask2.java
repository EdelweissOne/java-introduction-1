package com.hillel.lesson7.homework;

public class HomeworkTask2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (String.valueOf(i).indexOf('4') == -1 && (String.valueOf(i).indexOf('9') == -1 )) {
                System.out.println(i);
            }
        }
    }
}
