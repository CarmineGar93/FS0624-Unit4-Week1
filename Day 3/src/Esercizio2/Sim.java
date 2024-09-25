package Esercizio2;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Sim {
    private String nr;
    private double credito;
    private ArrayList<String> chiamate;
    private static double tariffa = 0.02;

    public Sim(String nr){
        this.nr = nr;
        credito = 0;
        chiamate = new ArrayList<>();
    }
    public static void stampaDati(Sim sim){
        System.out.println(MessageFormat.format("Il numero {0} ha credito: {1}", sim.nr,sim.credito));
        System.out.println("Le ultime chiamate del numero sono:");
        for (int i = 0; i < sim.chiamate.toArray().length; i+=2) {
            if(i == 10) break;
            System.out.println(sim.chiamate.toArray()[i] + " durata: " + sim.chiamate.toArray()[i+1] + " min");
        }
    }
    public static void addCredito(Sim s1, double add){
        s1.credito += add;
    }
    public void chiama(String numero, String durata){
        if(this.credito > Double.parseDouble(durata) * tariffa){
            this.credito -= Double.parseDouble(durata) * tariffa;
            this.chiamate.add(numero);
            this.chiamate.add(durata);
        } else {
            System.out.println("Credito insufficente");
        }
    }
}
