package com.hillel.lesson7.homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HomeworkTask1 {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Кoмпьютер загадал число от 0 до 10 : ");
        int max = 10;
        int min = 0;

        int randomNumber = (int) (Math.random() * (max - min) + min);
        equals(randomNumber);
    }

    private  static void equals(int randomNumber) throws IOException {
        while (true) {
            int number = Integer.parseInt(READER.readLine());
            if (number == randomNumber)  {
                System.out.println("Отгаданно ");
                break;
            }
        }
    }
}
