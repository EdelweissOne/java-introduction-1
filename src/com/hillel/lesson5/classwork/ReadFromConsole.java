package com.hillel.lesson5.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(str);
        Double d = Double.parseDouble(str);
        System.out.println(d);
    }
}
