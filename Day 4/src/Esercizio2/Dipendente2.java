package Esercizio2;

import Esercizio1.Dipartimento;

import java.util.Random;

public abstract class Dipendente2 implements Lavoratori {
    private String matricola;
    protected double stipendio;
    private Dipartimento dipartimento;

    public Dipendente2(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
        this.matricola = generateRandomString();
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
        return this.stipendio;
    }

    @Override
    public String toString() {
        return " matricola " + this.matricola + ", del settore " + this.dipartimento + " guadagna " + this.stipendio + " Euro al mese";
    }

    private static String generateRandomString(){
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
