package com.netflix.Hello;

public class Helloj {

    public static void main(String[] args) {

        System.out.println("Main");

        String name = "Ron";

        sayHello(name);
        sayGoodbye(name);
        sayGoodMorning(name);

    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name + " Welcome to the world!");
    }

    public static void sayGoodbye(String name) {
        System.out.println("Goodbye! " + name);
    }

    public static void sayGoodMorning(String name) {
        System.out.println("Good morning! " + name);
    }

}
