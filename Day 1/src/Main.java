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
        Main.backNForth();
        System.out.println("-----Esercizio 3------");
        System.out.println("Inserisci la base");
        double x = tastiera.nextDouble();
        System.out.println("Inserisci l'altezza");
        double y = tastiera.nextDouble();
        double perimetro = Main.perimetroRettangolo(x,y);
        System.out.println(MessageFormat.format("Il perimetro di un rettangolo in base {0} cm e altezza {1} cm è di {2} cm",x,y,perimetro));
        System.out.println("Inserisci un numero intero");
        int num = tastiera.nextInt();
        if(Main.pariDispari(num) == 0) {
            System.out.println(MessageFormat.format("Il numero {0} è pari",num));
        } else {
            System.out.println(MessageFormat.format("Il numero {0} è dispari",num));
        }
        System.out.println("Inserisci il primo lato");
        double a = tastiera.nextDouble();
        System.out.println("Inserisci il secondo lato");
        double b = tastiera.nextDouble();
        System.out.println("Inserisci il terzo lato");
        double c = tastiera.nextDouble();
        double area = Main.perimetroTriangolo(a,b,c);
        System.out.println(MessageFormat.format("L area del triangolo di lati {0}, {1}, {2} cm è di {3} cm2", a, b, c, area));


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

        StringBuilder forward = new StringBuilder(), backward = new StringBuilder();
        for (String s : inputs) {
            forward.append(s).append(" ");
        }
        for (int i = inputs.length-1; i >= 0; i--) {
            backward.append(inputs[i]).append(" ");
        }
        System.out.println("La stringa concatenata è: " + forward);
        System.out.println("La stringa concatenata al contrario è: " + backward);

    }
    public static double perimetroRettangolo (double b, double h) {
        return (b + h) * 2;
    }
    public static short pariDispari(int num) {
        if(num % 2 == 0) return 0;
        else return 1;
    }
    public static double perimetroTriangolo(double a, double b, double c){
        double sp = (a + b + c)/ 2;
        return Math.sqrt (sp * (sp-a) * (sp-b) * (sp-c));
    }
}