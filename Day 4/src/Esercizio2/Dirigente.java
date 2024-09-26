package Esercizio2;

import Esercizio1.Dipartimento;

public class Dirigente extends Dipendente2{
    public Dirigente(Dipartimento dipartimento) {
        super(dipartimento);
        this.stipendio = this.calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return switch (this.getDipartimento()){
            case PRODUZIONE -> 3000;
            case AMMINISTRAZIONE -> 5000;
            case VENDITE -> 4000;
        };
    }
}
