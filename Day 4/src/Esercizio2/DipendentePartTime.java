package Esercizio2;

import Esercizio1.Dipartimento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DipendentePartTime  extends Dipendente2{
    private int ore;
    public DipendentePartTime(Dipartimento dipartimento, int ore) {
        super(dipartimento);
        this.ore = ore;
        this.stipendio = this.calculateSalary();
    }

    @Override
    public double calculateSalary() {
        double result = super.calculateSalary() * ((double) this.ore /66);
        BigDecimal bd = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
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
