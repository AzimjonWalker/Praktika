package com.company;

//math defenition for straight:
//y = ax + b is function of straight
public class Straight {
    private double a;
    private double b;

    public Straight(double a, double b){
        this.a = a;
        this.b = b;
    }

    public boolean is_Paralell(Straight o){
        if (o == this) return true;
        if (o == null) return false;

        //true if abs(a) = abs(b)
        return (a == o.getA()) || (-a == o.getA());
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public static void main(String[] args) {
        Straight s1 = new Straight(2,8);
        Straight s2 = new Straight(8,3);

        if (s1.is_Paralell(s2))
            System.out.println("paralell");
        else
            System.out.println("not paralell");
    }
}
