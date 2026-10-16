package com.netflix;

import java.util.Scanner;

public class Main {
//    Access modifier (accessible in all files.)
//    Static means without instantiating an object.
//    Main main = new Main(); dont have to do this

//    Void means there is no result a method can expects back.
    static Scanner read = new Scanner(System.in); // This has to go on top for user inputs
    public static void main(String[] arg) {
    System.out.println("Coding is so cool!");

        Sport sport1 = new Sport();
        sport1.name = "Basketball";
        sport1.yearsPractised = 2;
        sport1.info();

        System.out.println("What is your name?"); // user is asked to input name
        String name = read.nextLine();
        System.out.println("What is your age?"); // user is asked how old they are
        int age = read.nextInt();
        calculateHowManyYearsLeftToWork(name, age); // refer to method below

    //System.out.println("Hi Sama");

    //message("Sama"); // can be pulled from anywhere.
    //message("Jofre"); // in this case, it is under the name static void
    //calculateHowManyYearsLeftToWork(27);

}

    public static void message(String name) {
        System.out.println("Hi, you are great " + name);
    }

    public static void calculateHowManyYearsLeftToWork(String name, int age) { // Make sure to add arguments with their data types
        int retirementAge = 67;
        int years = retirementAge - age;
        System.out.println(name + ", You still need " + years + " years before retirement.");
        // given the user inputs, this will calculate the years left and pull the name and result above.
    }



}
