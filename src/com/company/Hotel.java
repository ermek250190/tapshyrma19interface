package com.company;

public class Hotel extends Uiboloo implements  Jashoo{
    public Hotel(String adress, int adamSany) {
        super(adress, adamSany);
    }

    @Override
    public void oplata() {
        System.out.println("orendnya oplata za sutki 500$");
    }
}
