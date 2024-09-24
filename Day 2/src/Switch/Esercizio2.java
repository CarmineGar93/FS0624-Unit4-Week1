package Switch;

public class Esercizio2 {
    public static void intToString(int x){
        switch (x){
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Due");
            case 3 -> System.out.println("Tre");
            default -> System.out.println("Valore non consentito");
        }
    }
}
