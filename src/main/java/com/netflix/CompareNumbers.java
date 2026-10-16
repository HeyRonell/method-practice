package com.netflix;

public class CompareNumbers {
    public static void main(String[] args) {

        isEven(2);
        isPositive(5);


    }
// checking to see if the number has any remainder. If not, then it will print even
    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("not even");
        }

    }
// if the modulo is 1 or more, then it will print out positive (currently bugging due to boolean.
    public static void isPositive(double number) {
        if (number % 2 > 0) {
            System.out.println("it is positive");
            boolean isPositive;
        }
        else {
            System.out.println("it is not positive");
        }
    }
}
