package com.hillel.lesson2.home;

public class hometask {
    public static void main(String[] args) {
        // tack 1
        int a = 10;
        int b = 20;
        int c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // task 2
        float n = 55.443274F;
        float e = 8.338666F;
        System.out.println(" Northern latitude:" + n);
        System.out.println(" East longitude:" + e);
    }
}
