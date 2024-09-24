import If_Else.Esercizio1;
import Switch.Esercizio2;
import While.Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------Esercizio 1----------");
        System.out.println("-------------1.1--------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una stringa per verificare se la sua lunghezza è pari o dispari");
        String str = sc.nextLine();
        boolean verifica = Esercizio1.pariDispari(str);
        if(verifica) System.out.println("La stringa è pari");
        else System.out.println("La stringa è dispari");
        System.out.println("-------------1.2--------------");
        System.out.println("Inserisci un anno per verificare se è bisestile");
        int anno = sc.nextInt();
        boolean verifica2 = Esercizio1.annoBisestile(anno);
        if(verifica2) System.out.println("L'anno è bisestile");
        else System.out.println("L'anno non è bisestile");
        System.out.println("---------Esercizio 2----------");
        System.out.println("Inserisci un numero da 0 a 3");
        int valore = sc.nextInt();
        Esercizio2.intToString(valore);
        Esercizio3.addComma();

    }
}