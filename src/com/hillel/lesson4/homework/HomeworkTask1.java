package com.hillel.lesson4.homework;

public class HomeworkTask1 {

    public static void main(String[] args) {
        String name1 = "Jet";
        String type1 = "F-22 Raptor";
        String name2 = "Airliner";
        String type2 = "Aerobus 737";
        String type3 = "Boeng 777";
        int countEconSeat1 = 120;
        int countEconSeat2 = 180;
        int countBisSeat = 28;


        System.out.println(printAirplaneInfo(name1, type1));
        System.out.println(printAirplaneInfo(name2,type2,countEconSeat1));
        System.out.println(printAirplaneInfo(name2,type3,countEconSeat2, countBisSeat));

    }

    public static String printAirplaneInfo(String name, String type) {
        return "Тип самолета : " + name + ", модель: " + type;
    }

    public static String printAirplaneInfo(String name, String type, int countEconSeat) {
        return  "Тип самолета : " + name + ", модель: " + type + " кол, пассажиров эконом класса : " + countEconSeat;
    }

    public static String printAirplaneInfo(String name, String type, int countEconSeat, int countBisSeat) {
        return "Тип самолета : " + name + ", модель: " + type + " кол, пассажиров эконом класса : " + countEconSeat + " , пассажиров бизнес класса : " + countBisSeat;

    }
}
