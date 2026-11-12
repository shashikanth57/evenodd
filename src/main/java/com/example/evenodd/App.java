package com.example.evenodd;

public class App {

    public static String checkNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number = 10;

        System.out.println("Number: " + number);
        System.out.println("Result: " + checkNumber(number));
    }
}