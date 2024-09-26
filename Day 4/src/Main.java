import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente(1800,Dipartimento.VENDITE);
        Dipendente d2 = new Dipendente(2500, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dipendente(1500, Dipartimento.PRODUZIONE);
        ArrayList<Dipendente> dipendenti = new ArrayList<>();
        dipendenti.add(d1);
        dipendenti.add(d2);
        dipendenti.add(d3);
        for (Dipendente dip : dipendenti){
            System.out.println("La matricola del dipendente è: " + dip.getMatricola());
        }
    }
}