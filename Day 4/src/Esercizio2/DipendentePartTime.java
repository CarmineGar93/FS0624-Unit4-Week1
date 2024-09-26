package Esercizio2;

import Esercizio1.Dipartimento;

public class DipendentePartTime  extends Dipendente2{
    public DipendentePartTime(Dipartimento dipartimento, int ore) {
        super(dipartimento);
        if(ore > 66){
            this.stipendio = calculateSalary(66);
        } else {
            this.stipendio = calculateSalary(ore);
        }
    }

    public double calculateSalary(int ore) {
        return switch (this.getDipartimento()) {
            case PRODUZIONE -> 1200 * ((double) ore /66);
            case AMMINISTRAZIONE -> 2500 * ((double) ore /66);
            case VENDITE -> 1800 * ((double) ore /66);
        };
    }

    @Override
    public String toString() {
        return "Il lavoratore part-time" + super.toString();
    }

    @Override
    public void checkin() {
        System.out.println("Da dipendente part-time inizio a lavorare alle 14.00");
    }
}
