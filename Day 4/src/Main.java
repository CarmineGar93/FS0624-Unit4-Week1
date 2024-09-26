import Esercizio1.Dipartimento;
import Esercizio1.Dipendente;
import Esercizio2.Dipendente2;
import Esercizio2.DipendenteFullTime;
import Esercizio2.DipendentePartTime;
import Esercizio2.Dirigente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------Esercizio 1----------");
        Dipendente d1 = new Dipendente(1800, Dipartimento.VENDITE);
        Dipendente d2 = new Dipendente(2500, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dipendente(1500, Dipartimento.PRODUZIONE);
        ArrayList<Dipendente> dipendenti = new ArrayList<>();
        dipendenti.add(d1);
        dipendenti.add(d2);
        dipendenti.add(d3);
        for (Dipendente dip : dipendenti){
            System.out.println("La matricola del dipendente è: " + dip.getMatricola());
        }
        System.out.println("---------Esercizio 2----------");
        Dirigente dirAmm = new Dirigente(Dipartimento.AMMINISTRAZIONE);
        Dirigente dirVen = new Dirigente(Dipartimento.VENDITE);
        DipendenteFullTime fullPro = new DipendenteFullTime(Dipartimento.PRODUZIONE);
        DipendenteFullTime fullVen = new DipendenteFullTime(Dipartimento.VENDITE);
        DipendentePartTime partAmm = new DipendentePartTime(Dipartimento.AMMINISTRAZIONE, 40);
        DipendentePartTime partPro = new DipendentePartTime(Dipartimento.PRODUZIONE, 30);
        System.out.println(partPro);
        ArrayList<Dipendente2> dipendenti2 = new ArrayList<>();
        dipendenti2.add(dirAmm);
        dipendenti2.add(dirVen);
        dipendenti2.add(fullPro);
        dipendenti2.add(fullVen);
        dipendenti2.add(partPro);
        dipendenti2.add(partAmm);
        double tot = 0;
        for (Dipendente2 dip : dipendenti2){
            System.out.println(dip);
            tot += dip.getStipendio();
        }
        System.out.println("Il totale del salario dei dipendenti è di: " + tot + " Euro");

    }
}