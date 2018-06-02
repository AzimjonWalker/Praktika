package com.company;

public class MyCircle extends Circle {


    public MyCircle(double r, double x, double y) {
        super(r, x, y);
    }

    public double distance_to_another_circle(MyCircle o){
        if (o == null)
            throw new NullPointerException("null circle");

        double x1 = getX();
        double y1 = getY();
        double x2 = o.getX();
        double y2 = o.getY();

        //c = sqrt(a^2+b^2)
        return Math.sqrt((x1-x2)*(x1- x2) + (y1- y2)*(y1 - y2));
    }

    public boolean is_intersection(MyCircle o){
        if (o == this)
            return true;
        if (o == null)
            return false;

        //if length from a1 to a2 is less or equal than (r1+r2) than circles intersect
        //a - circles centers
        //r - radius
        double r1 = getRadius();
        double r2 = o.getRadius();


        return distance_to_another_circle(o) <= (r1+r2);
    }

    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(12,0,0);
        MyCircle c2 = new MyCircle(11,3,5);

        if (c1.is_intersection(c2))
            System.out.println("yes");
        else
            System.out.println("no, they are not intersect");
    }

}
