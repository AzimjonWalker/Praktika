package com.company;

public class Circle {

    private double radius;
    private double X;
    private double Y;

    public Circle(double r, double x, double y){
        radius = r;
        X = x;
        Y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double get_Area(){
        return Math.PI * X * X;
    }

    public double get_Length(){
        return Math.PI * 2 * radius;
    }

    public boolean is_Area_equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;
        return circle.get_Area() == get_Area();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("circle: center: (" + X  + "," + Y + ") and radius: " + radius);
        return builder.toString();
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(12,0,0);
        Circle c2 = new Circle(11,3,5);

        if(c1.is_Area_equals(c2)){
            System.out.println("circles are equal");
        }
        else System.out.println("they are not equal");
    }
}
