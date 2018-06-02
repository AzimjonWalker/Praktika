package com.company;

public class Stretche {
    protected double X1;
    protected double Y1;
    protected double X2;
    protected double Y2;

    public Stretche(double start_x, double start_y, double end_x, double end_y){
        X1 = start_x;
        Y1 = start_y;
        X2 = end_x;
        Y2 = end_y;
    }

    public double get_length(){
        return Math.sqrt(Math.pow(X2 - X1,2) + Math.pow(Y2 - Y1,2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Stretche))
            return false;

        Stretche o = (Stretche)obj;
        return get_length() == o.get_length();
    }

    public static void main(String[] args) {

        Stretche s1 = new Stretche(1,1,2,2);
        Stretche s2 = new Stretche(-3,0,-2,1);

        if(s1.equals(s2))
            System.out.println("equals");
        else
            System.out.println("not equals");
    }
}
