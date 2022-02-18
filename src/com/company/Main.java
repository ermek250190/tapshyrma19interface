package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Kvartira kvartira=new Kvartira("gorod Moskva,ulica Moskovskaia 88/2 podezd 2,kv 58,3 kmn",45);
        kvartira.oplata();
        System.out.println("kvartira   "+kvartira);
        Oshejitie oshejitie=new Oshejitie("gorod Bishkek ,ulica jibek jolu 55",30);
        kvartira.oplata();
        System.out.println("oshejitie"+oshejitie);
        Hotel hotel =new Hotel("gorod Moskva SwissHotel ulica new Arbat 48/3",30 );
        hotel.oplata();
        System.out.println("hotel"+hotel);
//        Jashoo[]jashoos={kvartira,oshejitie,hotel};
//
//        for (Jashoo jash:jashoos) {
//            jash.oplata();
//
//        }

    }
}
