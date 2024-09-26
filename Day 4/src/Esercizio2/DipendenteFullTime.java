package Esercizio2;

import Esercizio1.Dipartimento;

public class DipendenteFullTime extends Dipendente2 {

    public DipendenteFullTime(Dipartimento dipartimento) {
        super(dipartimento);
        this.stipendio = this.calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return switch (this.getDipartimento()){
            case PRODUZIONE -> 1200;
            case AMMINISTRAZIONE -> 2500;
            case VENDITE -> 1800;
        };
    }
}
