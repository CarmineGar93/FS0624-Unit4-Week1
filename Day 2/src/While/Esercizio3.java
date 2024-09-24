package While;

import java.util.Scanner;

public class Esercizio3 {

    public static void addComma(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Inserisci una stringa, :q per terminare");
            String str = sc.nextLine();
            if(str.equals(":q")) break;
            String[] result = str.split("");
            System.out.println(String.join(",",result));
        }
    }
}
