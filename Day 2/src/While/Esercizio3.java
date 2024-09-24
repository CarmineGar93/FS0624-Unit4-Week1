package While;

import java.util.Scanner;

public class Esercizio3 {

    public static void addComma(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Inserisci una stringa, :q per terminare");
            String str = sc.nextLine();
            if(str.equals(":q")) break;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                result.append(str.charAt(i));
                if(i < str.length() - 1){
                    result.append(",");
                }
            }
            System.out.println(result);
        }
    }
}
