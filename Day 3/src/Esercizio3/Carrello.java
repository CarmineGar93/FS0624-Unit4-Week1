package Esercizio3;

import java.util.ArrayList;

public class Carrello {
    private Cliente clienteAssociato;
    private ArrayList<Articolo> articoli;
    private double totale;

    public Carrello(Cliente cliente){
        this.clienteAssociato = cliente;
        articoli = new ArrayList<>();
        totale = 0;
    }

    public double getTotale() {
        return totale;
    }

    public void addToCart(Articolo articolo){
        if(articolo.getPcs() > 0){
            this.articoli.add(articolo);
            this.totale += articolo.getPrice();
            articolo.setPcs(articolo.getPcs() - 1);
        }
    }
}
