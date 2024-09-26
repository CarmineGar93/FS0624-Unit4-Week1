package Esercizio2;

import Esercizio1.Dipartimento;

public class DipendenteFullTime extends Dipendente2 {

    public DipendenteFullTime(Dipartimento dipartimento) {
        super(dipartimento);
        this.setRate(1.5);
        this.stipendio = this.calculateSalary();
    }


    @Override
    public String toString() {
        return "Il dipendente full-time" + super.toString();
    }

    @Override
    public void checkin() {
        System.out.println("Da dipendente fullTime inizio a lavorare alle 9.00");
    }
}
