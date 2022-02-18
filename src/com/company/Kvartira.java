package com.company;

public class Kvartira extends Uiboloo implements Jashoo{
    public Kvartira(String adress, int adamSany) {
        super(adress, adamSany);


    }

    @Override
    public void oplata() {
        System.out.println("oplata za kommunalnie uslugi 5000 za mesyac");
    }
}
