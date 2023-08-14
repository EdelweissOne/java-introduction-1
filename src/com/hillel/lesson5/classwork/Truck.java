package com.hillel.lesson5.classwork;

public class Truck {

    // public static int TRUCK_COUNT = 0;
    // public static final int TRUCK_MAX_WIGHT = 58;


    public static void main(String[] args) {

        int length = 10;
        int wigth = 40;
        int heught = 78;
        int volume = calculatedVolume(length, wigth, heught);
        System.out.println(volume);
        int maxWight = 58;
        int totalWight = calculatedVoluumeMax(volume , maxWight);
        System.out.println(totalWight);
    }

    public static int calculatedVolume(int lenght, int width , int heught) {
        return lenght * width * heught;
    }
    public static int calculatedVoluumeMax(int volume, int maxWight) {
        return volume * maxWight;

    }


}
