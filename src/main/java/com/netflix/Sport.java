package com.netflix;

public class Sport {
    String name; // leaving it blank on purpose
    int yearsPractised; // this is like having the empty quotes

    public void info() {
        System.out.println(name + yearsPractised);

    }
}
// static makes it more general and requires less setup.
// removing static is more specific (data that you input) and requires declarations.