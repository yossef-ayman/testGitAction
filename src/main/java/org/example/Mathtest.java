package org.example;

public class Mathtest {
    public  int add(int a, int b) {
        return a + b;
    }
    public  int sub(int a, int b) {
        return a - b;
    }
    public  int mul(int a, int b) {
        return a * b;
    }
    public  double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public  int mod(int a, int b) {
        return a % b;
    }

}

