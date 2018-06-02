package com.company;

import java.awt.geom.Area;

//rectangle with sides a and b
public class MyRectangle {
    private double a;
    private double b;

    public MyRectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    //area for one rectangle
    public double get_Area(){
        return a*b;
    }

    public boolean is_Area_Equals(MyRectangle o){
        if (o == this) return true;
        if (o == null) return false;

        return get_Area() == o.get_Area();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle(3,8);
        MyRectangle r2 = new MyRectangle(6,4);

        if (r1.is_Area_Equals(r2))
            System.out.println("equal area");
        else
            System.out.println("not equal");
    }
}
