package Esercizio2;

public class Chiamata {
    private String nrToCall;
    private int durata;

    public Chiamata(String nrToCall, int durata){
        this.nrToCall = nrToCall;
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public String getNrToCall() {
        return nrToCall;
    }

    public void setNrToCall(String nrToCall) {
        this.nrToCall = nrToCall;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
