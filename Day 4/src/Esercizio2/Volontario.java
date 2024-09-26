package Esercizio2;

public class Volontario implements Lavoratori{
    private String nomeCognome;
    private int eta;
    private String CV;

    public Volontario(String nomeCognome, int eta, String CV) {
        this.nomeCognome = nomeCognome;
        this.eta = eta;
        this.CV = CV;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    @Override
    public void checkin() {
        System.out.println("Da volontario inizio a lavorare alle 10.00");

    }
}
