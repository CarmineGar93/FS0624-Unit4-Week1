package Esercizio3;

import java.time.LocalDate;

public class Cliente {
    private final int codiceCliente = (int)(Math.random() * 10000);
    private String nomeCognome;
    private String email;
    private int annoIscrizione;

    public Cliente(String nomeCognome, String email){
        this.email = email;
        this.nomeCognome = nomeCognome;
        this.annoIscrizione = LocalDate.now().getYear();
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public String getEmail() {
        return email;
    }
    public String getNomeCognome() {
        return nomeCognome;
    }
    public int getAnnoIscrizione() {
        return annoIscrizione;
    }
    public int getCodiceCliente() {
        return codiceCliente;
    }
}
