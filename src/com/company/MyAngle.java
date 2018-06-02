package com.company;

//class for representation the angles
public class MyAngle {
    private double gradus;
    private double radian;

    MyAngle(double gradus){
        this.gradus = gradus;

        //cut the unnecessary degree
        gradus %= 360;
    }

    public boolean is_Perpeddikular(MyAngle o){
        if (this == o) return false;
        if (o == null) return false;

        //for checking we will compare a1 - 90 and a1 + 90 with second gradus

        double degree = (gradus + 90) % 360;
        double degree_2;

        if (gradus > 90)
            degree_2 = gradus - 90;
        else
            degree_2 = gradus + 360 - 90;

        return (o.getGradus() == degree) || (o.getGradus() == degree_2);
    }


    public double getGradus() {
        return gradus;
    }

    public double getRadian() {
        return radian;
    }

    public static void main(String[] args) {
        MyAngle a1 = new MyAngle(10);
        MyAngle a2 = new MyAngle(280);

        if (a1.is_Perpeddikular(a2))
            System.out.println("perpendikular");
        else
            System.out.println("not perpendikular");
    }
}
