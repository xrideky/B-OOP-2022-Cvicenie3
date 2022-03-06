package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Auto skoda=new Auto();
        Auto fiat=new Auto(50);


        System.out.println("Skoda");
        System.out.println(skoda.stav());
        skoda.jazdi(100);
        System.out.println(skoda.stav());

        System.out.println();

        System.out.println("Fiat");
        System.out.println(fiat.stav());
        fiat.jazdi(100);
        System.out.println(fiat.stav());


    }
}
