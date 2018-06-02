package com.company;

// complex number is  ai + b
// i is sqrt of -1
public class Complex_Number {
    private double a;
    private double b;

    public Complex_Number(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double modul(Complex_Number o){
        if (o == null)
            throw new IllegalArgumentException("input value can't be null");

        a += o.getA();
        b += o.getB();

        return Math.sqrt(a*a + b*b);
    }

    public static void main(String[] args) {
        Complex_Number n1 = new Complex_Number(3,1);
        Complex_Number n2 = new Complex_Number(2,-1);

        System.out.println("module of sum of two complex numbers is " + n1.modul(n2));

    }
}
