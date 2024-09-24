import If_Else.Esercizio1;

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

    }
}