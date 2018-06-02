package com.company;

//program will calculate outside radius of the correct n- angle
public class N_Angle {
    private int sides;
    private double length;

    N_Angle(int n, double length){
        if(n < 3)
            throw new IllegalArgumentException("sides can't be less than 3");

        sides = n;
        this.length = length;
    }

    public double get_outside_radius(){

        // sin alfa = (a/2) / R;
        // R = (a/2) / sin(alfa);
        double alfa = Math.toRadians(180 / sides);


        return (length / 2) / Math.sin(alfa);
    }

    public int getSides() {
        return sides;
    }

    public double getLength() {
        return length;
    }

    public static void main(String[] args) {
        N_Angle a1 = new N_Angle(7,6);

        System.out.println("outside radius for n-angle: " + a1.get_outside_radius());
    }

}
