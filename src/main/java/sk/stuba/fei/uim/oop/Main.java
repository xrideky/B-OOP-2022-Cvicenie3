package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;

public class Main {
    public static void main(String[] args) {
        Auto skoda=new Auto();
        Auto bmw= new Auto();

        skoda.jedna=5;
        bmw.jedna=7;

        if(bmw.jedna==skoda.jedna){
            System.out.println("rovnake");
        }
        else {
            System.out.println("rôzne");
        }

    }
}
