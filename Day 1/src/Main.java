import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("-----Esercizio 1------");
        System.out.println(Main.moltiplica(5, 10));
        System.out.println(Main.concatena("ciao sono il numero ", 1));
        System.out.println(Arrays.toString(Main.inserisciinArray(new String[]{"ciao", "a", "voi", "amici", "miei"}, "tutti")));
        System.out.println("-----Esercizio 2------");
        /*Main.backNForth();*/
        System.out.println("-----Esercizio 3------");
        System.out.println("Inserisci la base");
        double x = tastiera.nextDouble();
        System.out.println("Inserisci l'altezza");
        double y = tastiera.nextDouble();
        double perimetro = Main.perimetroRettangolo(x,y);
        System.out.println(MessageFormat.format("Il perimetro di un rettangolo in base {0} cm e altezza {1} cm è di {2} cm",x,y,perimetro));


    }
    public static int moltiplica (int num1, int num2) {
        return num1 * num2;
    }
    public static String concatena(String stringa, int num) {
        return stringa + num;
    }

    public static String[] inserisciinArray(String[] array, String insert) {
            String[] newArr = new String[array.length + 1];
            System.arraycopy(array, 0, newArr, 0,2);
            newArr[2] = insert;
            System.arraycopy(array, 2, newArr, 3, array.length - 2);
            return newArr;

    }
    public static void backNForth () {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci tre stringhe");
        String[] inputs = new String[3];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = tastiera.nextLine();
        }
        String forward = "", backward = "";
        for (String s : inputs) {
            forward += s + " ";
        }
        for (int i = inputs.length-1; i >= 0; i--) {
            backward += inputs[i] + " ";
        }
        System.out.println("La stringa concatenata è: " + forward);
        System.out.println("La stringa concatenata al contrario è: " + backward);

    }
    public static double perimetroRettangolo (double b, double h) {
        return (b + h) * 2;
    }
}