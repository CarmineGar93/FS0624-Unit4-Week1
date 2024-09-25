package Esercizio1;

public class Rettangolo {
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calculateP(){
        return (this.altezza + this.base) * 2;
    }
    public double calculateA(){
        return this.altezza * this.base;
    }
    public static void print(Rettangolo r1){
        System.out.println("L'area del rettangolo è: " + r1.calculateA());
        System.out.println("Il perimetro del rettangolo è: " + r1.calculateP());
    }
    public static void print2(Rettangolo r1, Rettangolo r2){
        System.out.println("Perimetro 1: " + r1.calculateP());
        System.out.println("Perimetro 2: " + r2.calculateP());
        System.out.println("Area 1: " + r1.calculateA());
        System.out.println("Area 2: " + r2.calculateA());
        System.out.println("Somma dei perimetri: " + (r1.calculateP() + r2.calculateP()));
        System.out.println("Somma delle aree: " + (r1.calculateA() + r2.calculateA()));
    }
}
