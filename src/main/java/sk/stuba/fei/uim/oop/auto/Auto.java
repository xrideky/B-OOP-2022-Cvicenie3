package sk.stuba.fei.uim.oop.auto;

import java.util.Random;
import java.util.Scanner;

public class Auto {
    private Scanner scanner;
    private Random random;

    public Auto(){
        this.scanner=new Scanner(System.in);
        this.random=new Random();

    }

    public void nacitaj(){
        System.out.println("Zadaj string");
        String meno=scanner.nextLine();
        System.out.println("Nacital som "+meno);

        System.out.println("Vygeneroval som nahodne cislo od 0 po 1000: "+random.nextInt(1001));
    }
}
