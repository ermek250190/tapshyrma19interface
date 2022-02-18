package com.company;

public abstract class Uiboloo {
    private String Adress;
    private int adamSany;

    public Uiboloo(String adress, int adamSany) {
        Adress = adress;
        this.adamSany = adamSany;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public int getAdamSany() {
        return adamSany;
    }

    public void setAdamSany(int adamSany) {
        this.adamSany = adamSany;
    }

    @Override
    public String toString() {
        return "Uiboloo{    " +
                "Adress='\n" + Adress + '\'' +
                ", adamSany=\n" + adamSany +
                '}';
    }
}

