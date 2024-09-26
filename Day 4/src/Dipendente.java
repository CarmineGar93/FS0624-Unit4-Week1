import java.util.Random;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(double stipendio, Dipartimento dipartimento) {
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
        this.matricola = generateRandomString();
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
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
