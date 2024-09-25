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

    public void mostraArticoli(){
        Articolo[] array = this.articoli.toArray(new Articolo[0]);
        if(array.length == 0){
            System.out.println("Non ci sono articoli nel carrello");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i].getDescription() + " - Qty: " + array[i].getPcs());
            }
        }
    }

    public void addToCart(Articolo articolo, int qty){
        if(articolo.getPcs() > 0){
            Articolo added = new Articolo(articolo.getDescription(),articolo.getPrice(),qty);
            this.articoli.add(added);
            this.totale += (added.getPrice() * qty);
            articolo.setPcs(articolo.getPcs() - qty);
        }
    }
}
