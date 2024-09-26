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
            case PRODUZIONE -> 1200 * (((double) 66 /100) * ore);
            case AMMINISTRAZIONE -> 2500 * (((double) 66 /100) * ore);
            case VENDITE -> 1800 * (((double) 66 /100) * ore);
        };
    }
}
