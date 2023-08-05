package com.hillel.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOverloading {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String test = bufferedReader.readLine();
        String test2 = bufferedReader.readLine();
        printConcatenation(test, test2);

    }

    public static void printConcatenation(String s1, String s2){
        System.out.println(s1 + s2);


    }


}
