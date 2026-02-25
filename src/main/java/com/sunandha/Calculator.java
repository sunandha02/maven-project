package com.sunandha;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // 👇 ADD THIS PART
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(5, 3));
    }
}