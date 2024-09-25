package Esercizio3;

import java.util.ArrayList;
import java.util.Objects;

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

    private void setTotale(){
        this.totale = 0;
        Articolo[] array = this.articoli.toArray(new Articolo[0]);
        if(array.length == 0){
            this.totale = 0;
        } else {
            for (Articolo articolo : array) {
                this.totale += articolo.getPrice() * articolo.getPcs();
            }
        }
    }

    public void mostraArticoli(){
        System.out.println("Carrello di " + this.clienteAssociato.getNomeCognome());
        Articolo[] array = this.articoli.toArray(new Articolo[0]);
        if(array.length == 0){
            System.out.println("Non ci sono articoli nel carrello");
        } else {
            System.out.println("Articoli nel carrello: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i].getDescription() + " - Qty: " + array[i].getPcs());
            }
        }
        System.out.println("Totale carrello: " + this.getTotale());
    }

    public void addToCart(Articolo articolo, int qty){
        if(articolo.getPcs() > 0){
            Articolo added = new Articolo(articolo.getDescription(),articolo.getPrice(),qty);
            this.articoli.add(added);
            this.setTotale();
            articolo.setPcs(articolo.getPcs() - qty);
        }
    }

    public void removeFromCart(Articolo articolo){
        this.articoli.removeIf(articolo1 -> Objects.equals(articolo1.getDescription(), articolo.getDescription()));
        this.setTotale();
    }
}
