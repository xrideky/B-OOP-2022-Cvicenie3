package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;

public class Main {
    public static void main(String[] args) {
        Auto skoda=new Auto();

        skoda.stavNadrze=60;
        skoda.jazdi(100);
        System.out.println(skoda.stavNadrze);

        skoda.jazdi(200);
        System.out.println(skoda.stavNadrze);
    }
}
