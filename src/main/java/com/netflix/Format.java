package com.netflix;

public class Format {
    public static void main(String[] args) {
        String firstName = "Ron";
        String secondName = "Bautista";

        formatName(firstName, secondName);

    }

    public static void formatName(String firstName, String secondName) {
        System.out.println(secondName + "," + firstName);
    }
}
