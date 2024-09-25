package Esercizio3;

public class Articolo {
    private final int id = (int) (Math.random() * 1000);
    private String description;
    private double price;
    private int pcs;

    public Articolo(String description, double price, int pcs){
        this.description = description;
        this.pcs = pcs;
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setPcs(int pcs) {
        this.pcs = pcs;
    }

    public int getPcs() {
        return pcs;
    }
    public double getPrice() {
        return price;
    }
}
