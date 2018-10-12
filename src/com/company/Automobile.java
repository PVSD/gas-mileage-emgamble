package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {

    public int MilesPerGallon;

    public Automobile(int MPG){
        MilesPerGallon = MPG;
    }

    public int gallons;

    public void fillUp (int g){
        g = gallons;
    }

    public int miles;
    double leftoverFuel;
    public void takeTrip(int m){
        miles = m;

        leftoverFuel = (gallons - (miles/MilesPerGallon));
    }
    public double reportFuel(){
        return leftoverFuel;
    }


}
