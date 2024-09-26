package Esercizio2;

import Esercizio1.Dipartimento;

public class DipendentePartTime  extends Dipendente2{
    private int ore;
    public DipendentePartTime(Dipartimento dipartimento, int ore) {
        super(dipartimento);
        this.ore = ore;
        this.stipendio = this.calculateSalary();
    }

    public double calculateSalary() {
        return switch (this.getDipartimento()) {
            case PRODUZIONE -> 1200 * ((double) this.ore /66);
            case AMMINISTRAZIONE -> 2500 * ((double) this.ore /66);
            case VENDITE -> 1800 * ((double) this.ore /66);
        };
    }

    @Override
    public String toString() {
        return "Il lavoratore part-time" + super.toString() + ", lavorando " + this.ore + " ore alla settimana";
    }

    @Override
    public void checkin() {
        System.out.println("Da dipendente part-time inizio a lavorare alle 14.00");
    }
}
