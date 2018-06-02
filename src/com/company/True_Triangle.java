package com.company;

public class True_Triangle {
    private double gipotenuza;
    private double katet_1;
    private double katet_2;

    public True_Triangle(double katet_1, double katet_2){
        if (katet_1 == 0 || katet_2 == 0){
            System.out.println("error constructing object: katet can't be zero");
            throw new IllegalArgumentException("error constructing object: katet can't be zero");
        }

        this.katet_1 = katet_1;
        this.katet_2 = katet_2;

        //finding gipotenuza in main constructor
        gipotenuza = Math.sqrt(katet_1*katet_1 + katet_2*katet_2);
    }

    public double getGipotenuza() {
        return gipotenuza;
    }

    public double getKatet_1() {
        return katet_1;
    }

    public double getKatet_2() {
        return katet_2;
    }

    public double get_proportion(){
        return katet_1 / katet_2;
    }

    public boolean is_Similar(True_Triangle o){
        if (o == this)
            return true;

        return get_proportion() == o.get_proportion();
    }

    public static void main(String[] args) {
        True_Triangle t1 = new True_Triangle(3,4);
        True_Triangle t2 = new True_Triangle(6,8);

        if (t1.is_Similar(t2))
            System.out.println("similar");
        else
            System.out.println("not similar");

    }

}
