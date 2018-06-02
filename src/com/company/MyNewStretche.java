package com.company;

public class MyNewStretche extends Stretche {

    public MyNewStretche(double start_x, double start_y, double end_x, double end_y) {
        super(start_x, start_y, end_x, end_y);
    }

    public int have_same_point(MyNewStretche o){
        if (o == null)
            throw new NullPointerException("not exist stretche");

        //4 conditions
        int n=0;
        if (X1 == o.X1 && Y1 == o.Y1)
            n++;
        if (X1 == o.X2 && Y1 == o.Y2)
            n++;

        if (n == 2)
            return n;

        if(X2 == o.X1 && Y2 == o.Y1)
            n++;
        if(X2 == o.X2 && Y2 == o.Y2)
            n++;

        return n;
    }


    public static void main(String[] args) {
        MyNewStretche m1 = new MyNewStretche(1,1,2,2);
        MyNewStretche m2 = new MyNewStretche(-3,0,1,1);

        int n = 0;
        if ((n = m1.have_same_point(m2)) > 0)
            System.out.println("they have " + n + " same points");
        else
            System.out.println("they don't have same points");
    }
}
