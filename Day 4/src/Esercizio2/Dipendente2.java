package Esercizio2;

import Esercizio1.Dipartimento;

import java.util.Random;

public abstract class Dipendente2 implements Lavoratori {
    private final String matricola;
    protected double stipendio;
    private Dipartimento dipartimento;
    private double rate = 1;

    public Dipendente2(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
        this.matricola = generateRandomString();
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double calculateSalary(){
        return switch (this.getDipartimento()){
            case PRODUZIONE -> 1000 * this.rate;
            case AMMINISTRAZIONE -> 1800 * this.rate;
            case VENDITE -> 1200 * this.rate;
        };
    }

    @Override
    public String toString() {
        return " matricola " + this.matricola + ", del settore " + this.dipartimento + " guadagna " + this.stipendio + " Euro al mese";
    }

    private String generateRandomString(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(characters.length());
            stringBuilder.append(characters.charAt(index));
        }

        return stringBuilder.toString();
    }
}
