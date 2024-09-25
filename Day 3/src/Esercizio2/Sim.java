package Esercizio2;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Sim {
    private String nr;
    private double credito;
    private ArrayList<String> chiamate;
    private static final double tariffa = 0.02;

    public Sim(String nr){
        this.nr = nr;
        credito = 0;
        chiamate = new ArrayList<>();
    }

    public String getNr() {
        return nr;
    }

    public static void setNr(Sim s1, String nr) {
        s1.nr = nr;
    }

    public static void stampaDati(Sim sim){
        System.out.println(MessageFormat.format("Il numero {0} ha credito: {1}", sim.nr,sim.credito));
        if(sim.chiamate.toArray().length == 0){
            System.out.println("Il numero non ha effettuato alcuna chiamata");
        } else {
            System.out.println("Le ultime chiamate del numero sono:");
            for (int i = 0; i < sim.chiamate.toArray().length; i+=2) {
                if(i == 10) break;
                System.out.println(sim.chiamate.toArray()[i] + " durata: " + sim.chiamate.toArray()[i+1] + " min");
            }
        }
        System.out.println();

    }
    public static void addCredito(Sim s1, double add){
        s1.credito += add;
        System.out.println("Ricarica effettuata - nuovo credito: " + s1.credito);
    }
    public void chiama(String numero, String durata){
        System.out.println("Tentativo di chiamata");
        if(this.credito > Double.parseDouble(durata) * tariffa){
            this.credito -= Double.parseDouble(durata) * tariffa;
            this.chiamate.add(numero);
            this.chiamate.add(durata);
            System.out.println(this.nr + " ha chiamato " + numero + " durata " + durata);
        } else {
            System.out.println("Chaiamata rifiutata - credito insufficente");
        }
        System.out.println();
    }
}
