package sk.stuba.fei.uim.oop.auto;

public class Auto {
   public double stavNadrze;
   public double kapacitaNadrze;

    //metoda
    public void jazdi(double vzdialenost){
        stavNadrze = stavNadrze-vzdialenost * 0.2; //na 1km bude spotreba 0.2 paliva
        if(stavNadrze<0){
            stavNadrze=0;
        }
    }
}
