package Esercizio2;

import Esercizio1.Dipartimento;

public class Dirigente extends Dipendente2{
    public Dirigente(Dipartimento dipartimento) {
        super(dipartimento);
        this.setRate(2.5);
        this.stipendio = this.calculateSalary();
    }

    @Override
    public String toString() {
        return "Il dirigente" + super.toString();
    }

    @Override
    public void checkin() {
        System.out.println("Da dirigente inizio a lavorare quando mi pare e piace");
    }
}
